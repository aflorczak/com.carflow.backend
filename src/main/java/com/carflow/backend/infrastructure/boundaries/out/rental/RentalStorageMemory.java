package com.carflow.backend.infrastructure.boundaries.out.rental;

import com.carflow.backend.domains.rental.entities.Rental;
import com.carflow.backend.domains.rental.interfaces.RentalStorage;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RentalStorageMemory implements RentalStorage {
    private HashMap<String, Rental> rentals = new HashMap<String, Rental>();
    private Integer nextId = 0;

    public RentalStorageMemory() {
        createnewRental(new Rental(
                nextId + 1,
                "10",
                215,
                "ul. Kwidzyńska 4, Wrocław",
                "15:00",
                null,
                null,
                null,
                null,
                "ul. Kwidzyńska 4, Wrocław",
                "15:00",
                null,
                null,
                false,
                null,
                null
        ));
    }

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
    public Rental getRentalById(String id) throws ObjectNotFoundException {
        if (rentals.containsKey(id)) {
            return rentals.get(id);
        } else {
            throw new ObjectNotFoundException("The rental with the given ID does not exist in the database.");
        }

    }

    @Override
    public Rental updateRentalById(String id, Rental updatedRental) throws ObjectNotFoundException {
        if (rentals.containsKey(id)) {
            rentals.remove(id);
            rentals.put(id, updatedRental);
            return rentals.get(id);
        } else {
            throw new ObjectNotFoundException("The rental with the given ID does not exist in the database.");
        }
    }

    @Override
    public void deleteRentalById(String id) throws ObjectNotFoundException {
        if (rentals.containsKey(id)) {
            rentals.remove(id);
        } else {
            throw new ObjectNotFoundException("The rental with the given ID does not exist in the database.");
        }
    }
}
