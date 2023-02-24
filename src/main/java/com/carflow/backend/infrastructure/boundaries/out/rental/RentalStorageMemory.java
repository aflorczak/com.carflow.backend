package com.carflow.backend.infrastructure.boundaries.out.rental;

import com.carflow.backend.domains.rental.entities.Rental;
import com.carflow.backend.domains.rental.interfaces.RentalStorage;

import java.util.HashMap;
import java.util.List;

public class RentalStorageMemory implements RentalStorage {

    private HashMap<String, Rental> rentals = new HashMap<String, Rental>();
    private Integer nextId = 0;

    @Override
    public Rental createnewRental(Rental rental) {
        String id = (++nextId).toString();
        rentals.put(id, new Rental(
                nextId,
                rental.getOrdersId(),
                rental.getCarId(),
                rental.getDeliveryAddress(),
                rental.getDeliveryTime(),
                rental.getScanOfTheContractUrl(),
                rental.getScansOfTheRegulationsUrls(),
                rental.getScanOfTheDeliveryProtocolUrl(),
                rental.getDeliveryPhotosUrls(),
                rental.getReturnAddress(),
                rental.getReturnTime(),
                rental.getReturnPhotosUrls(),
                rental.getScanOfTheReturnProtocolUrl(),
                rental.isDamagedVehicle(),
                rental.getDamagedDescription(),
                rental.getDamagedPhotosUrls()
        ));
        return rentals.get(id);
    }

    @Override
    public List<Rental> getAllRentals() {
        return rentals.values().stream().toList();
    }

    @Override
    public Rental getRentalById(String id) {
        return rentals.get(id);
    }

    @Override
    public Rental updateRentalById(String id, Rental updatedRental) {
        rentals.remove(id);
        return rentals.put(id, updatedRental);
    }

    @Override
    public void deleteRentalById(String id) {
        rentals.remove(id);
    }
}
