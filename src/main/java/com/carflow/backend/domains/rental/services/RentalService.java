package com.carflow.backend.domains.rental.services;

import com.carflow.backend.domains.rental.entities.Rental;
import com.carflow.backend.domains.rental.interfaces.RentalStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {
    private RentalStorage storage;

    @Autowired
    public RentalService(RentalStorage storage) {
        this.storage = storage;
    }

    public Rental createNewRental(Rental rental) {
        return storage.createnewRental(rental);
    }

    public List<Rental> getAllRentals() {
        return storage.getAllRentals();
    }

    public Rental getRentalById(String id) {
        return storage.getRentalById(id);
    }

    public Rental updateRentalById(String id, Rental updatedRental) {
        return storage.updateRentalById(id, updatedRental);
    }

    public void deleteRentalById(String id) {
        storage.deleteRentalById(id);
    }

}