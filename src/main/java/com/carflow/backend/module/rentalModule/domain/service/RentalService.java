package com.carflow.backend.module.rentalModule.domain.service;


import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.rentalModule.domain.interfaces.RentalStorage;
import com.carflow.backend.module.rentalModule.domain.model.Rental;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RentalService {
    private final RentalStorage storage;

    public RentalService(RentalStorage storage) {
        this.storage = storage;
    }

    public Rental createNewRental(Rental rental) {
        return storage.createNewRental(new Rental(
                rental.getId(),
                rental.getArchived(),
                rental.getOrderId(),
                rental.getCarId(),
                rental.getAttachmentsIds(),
                rental.getDeliveryOperationId(),
                rental.getReturnOperationId()
        ));
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
