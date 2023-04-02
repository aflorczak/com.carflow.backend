package com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.service;

import com.carflow.backend.module.rentalModule.domain.interfaces.RentalStorage;
import com.carflow.backend.module.rentalModule.domain.model.Rental;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.entity.RentalEntity;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.helper.RentalEntityConverter;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.repository.RentalRepository;
import com.carflow.backend.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SQLRentalStorage implements RentalStorage {
    private final RentalRepository rentalRepository;
    private final RentalEntityConverter rentalEntityConverter;

    public SQLRentalStorage(
            RentalRepository rentalRepository,
            RentalEntityConverter rentalEntityConverter
    ) {
        this.rentalRepository = rentalRepository;
        this.rentalEntityConverter = rentalEntityConverter;
    }
    @Override
    public Rental createNewRental(Rental rental) {
        return rentalEntityConverter.convertRentalEntityToRental(rentalRepository.save(rentalEntityConverter.convertRentalToRentalEntity(rental)));
    }

    @Override
    public List<Rental> getAllRentals() {
        return rentalRepository.findAll().stream().map(rentalEntityConverter::convertRentalEntityToRental).toList();
    }

    @Override
    public Rental getRentalById(String id) throws ObjectNotFoundException {
        Optional<RentalEntity> rental = rentalRepository.findById(id);
        if (rental.isPresent()) {
            return rentalEntityConverter.convertRentalEntityToRental(rental.get());
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }

    @Override
    public Rental updateRentalById(String id, Rental updatedRental) throws ObjectNotFoundException {
        if (rentalRepository.existsById(id)) {
            return rentalEntityConverter.convertRentalEntityToRental(rentalRepository.save(rentalEntityConverter.convertRentalToRentalEntity(updatedRental)));
        } else {
            throw new ObjectNotFoundException("Object not found.");
        }
    }

    @Override
    public void deleteRentalById(String id) throws ObjectNotFoundException {
        if (rentalRepository.existsById(id)) {
            rentalRepository.deleteById(id);
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }

    @Override
    public void moveRentalToArchive(String id) throws ObjectNotFoundException {
        Optional<RentalEntity> rental = rentalRepository.findById(id);
        if (rental.isPresent()) {
            RentalEntity getRental = rental.get();
            getRental.setArchived(true);
            rentalRepository.save(getRental);
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }
}
