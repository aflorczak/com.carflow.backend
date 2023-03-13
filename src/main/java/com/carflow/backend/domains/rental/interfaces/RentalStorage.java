package com.carflow.backend.domains.rental.interfaces;

import com.carflow.backend.domains.rental.models.Rental;
import com.carflow.backend.exceptions.ObjectNotFoundException;

import java.util.List;

public interface RentalStorage {
    public Rental createnewRental(Rental rental);
    public List<Rental> getAllRentals();
    public Rental getRentalById(String id) throws ObjectNotFoundException;
    public Rental updateRentalById(String id, Rental updatedRental) throws ObjectNotFoundException;
    public void deleteRentalById(String id) throws ObjectNotFoundException;
}
