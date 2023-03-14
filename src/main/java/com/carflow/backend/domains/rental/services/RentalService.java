package com.carflow.backend.domains.rental.services;

import com.carflow.backend.domains.rental.models.Rental;
import com.carflow.backend.domains.rental.interfaces.RentalStorage;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {
    final private RentalStorage storage;

    public RentalService(RentalStorage storage) {
        this.storage = storage;
    }

    public Rental createNewRental(Rental rental) {
        return storage.createnewRental(rental);
    }

    public List<Rental> getAllRentals() {
        return storage.getAllRentals();
    }

    public Rental getRentalById(String id) throws ObjectNotFoundException{
        return storage.getRentalById(id);
    }

    public Rental updateRentalById(String id, Rental updatedRental) throws ObjectNotFoundException {
        return storage.updateRentalById(id, updatedRental);
    }

    public void deleteRentalById(String id) throws ObjectNotFoundException {
        storage.deleteRentalById(id);
    }

    public void moveRentalToArchive(String id) throws ObjectNotFoundException {
        storage.moveRentalToArchive(id);
    }

}
