package com.carflow.backend.domains.rental.interfaces;

import com.carflow.backend.domains.rental.entities.Rental;

import java.util.List;

public interface RentalStorage {
    public Rental createnewRental(Rental rental);
    public List<Rental> getAllRentals();
    public Rental getRentalById(String id);
    public Rental updateRentalById(String id, Rental updatedRental);
    public void deleteRentalById(String id);
}
