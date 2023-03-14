package com.carflow.backend.infrastructure.boundaries.out.rental.implementations;

import com.carflow.backend.domains.rental.interfaces.RentalStorage;
import com.carflow.backend.domains.rental.models.Rental;
import com.carflow.backend.domains.rental.services.RentalService;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import com.carflow.backend.infrastructure.boundaries.out.rental.entity.RentalEntity;
import com.carflow.backend.infrastructure.boundaries.out.rental.helpers.RentalEntityConverter;
import com.carflow.backend.infrastructure.boundaries.out.rental.repository.RentalRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Profile("sqlStorage")
public class SQLRentalStorage implements RentalStorage {
    private final RentalRepository rentalRepository;
    private final RentalEntityConverter rentalEntityConverter;

    public SQLRentalStorage(RentalEntityConverter rentalEntityConverter, RentalRepository rentalRepository) {
        this.rentalEntityConverter = rentalEntityConverter;
        this.rentalRepository = rentalRepository;
    }
    @Override
    public Rental createnewRental(Rental rental) {
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
        return rentalEntityConverter.convertRentalEntityToRental(rentalRepository.save(rentalEntityConverter.convertRentalToRentalEntity(updatedRental)));
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
            rental.get().setArchive(true);
            rentalRepository.save(rental.get());
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }
}
