package com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.implementation;

import com.carflow.backend.modules.rentalModule.domain.interfaces.RentalStorage;
import com.carflow.backend.modules.rentalModule.domain.model.Rental;
import com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.repository.RentalRepository;
import com.carflow.backend.exception.ObjectNotFoundException;
//import com.carflow.backend.infrastructure.boundaries.out.rental.entity.RentalEntity;
//import com.carflow.backend.infrastructure.boundaries.out.rental.helper.RentalEntityConverter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("sqlStorage")
public class SQLRentalStorage implements RentalStorage {
    private final RentalRepository rentalRepository;

    public SQLRentalStorage(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }
    @Override
    public Rental createNewRental(Rental rental) {
        //return rentalEntityConverter.convertRentalEntityToRental(rentalRepository.save(rentalEntityConverter.convertRentalToRentalEntity(rental)));
        return null;
    }

    @Override
    public List<Rental> getAllRentals() {
        //return rentalRepository.findAll().stream().map(rentalEntityConverter::convertRentalEntityToRental).toList();
        return null;
    }

    @Override
    public Rental getRentalById(String id) throws ObjectNotFoundException {
//        Optional<RentalEntity> rental = rentalRepository.findById(id);
//        if (rental.isPresent()) {
//            return rentalEntityConverter.convertRentalEntityToRental(rental.get());
//        } else {
//            throw new ObjectNotFoundException("Object not found");
//        }
        return null;
    }

    @Override
    public Rental updateRentalById(String id, Rental updatedRental) throws ObjectNotFoundException {
        //return rentalEntityConverter.convertRentalEntityToRental(rentalRepository.save(rentalEntityConverter.convertRentalToRentalEntity(updatedRental)));
        return null;
    }

    @Override
    public void deleteRentalById(String id) throws ObjectNotFoundException {
//        if (rentalRepository.existsById(id)) {
//            rentalRepository.deleteById(id);
//        } else {
//            throw new ObjectNotFoundException("Object not found");
//        }
    }

    @Override
    public void moveRentalToArchive(String id) throws ObjectNotFoundException {
//        Optional<RentalEntity> rental = rentalRepository.findById(id);
//        if (rental.isPresent()) {
//            RentalEntity getRental = rental.get();
//            getRental.setArchive(true);
//            rentalRepository.save(getRental);
//        } else {
//            throw new ObjectNotFoundException("Object not found");
//        }
    }
}
