package com.carflow.backend.module.rentalModule.domain.interfaces;

import com.carflow.backend.module.rentalModule.domain.model.Rental;
import com.carflow.backend.exception.ObjectNotFoundException;

import java.util.List;


public interface RentalStorage {
    public Rental createNewRental(Rental rental);
    public List<Rental> getAllRentals();
    public Rental getRentalById(String id) throws ObjectNotFoundException;
    public Rental updateRentalById(String id, Rental updatedRental) throws ObjectNotFoundException;
    public void deleteRentalById(String id) throws ObjectNotFoundException;
    public void moveRentalToArchive(String id) throws ObjectNotFoundException;
}
