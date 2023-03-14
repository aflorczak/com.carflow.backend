package com.carflow.backend.infrastructure.boundaries.out.rental.helpers;

import com.carflow.backend.domains.rental.models.Rental;
import com.carflow.backend.infrastructure.boundaries.out.rental.entity.RentalEntity;
import org.springframework.stereotype.Service;

@Service
public class RentalEntityConverter {
    public Rental convertRentalEntityToRental(RentalEntity rentalEntity) {
        return new Rental(
                rentalEntity.getId(),
                rentalEntity.getArchive(),
                rentalEntity.getOrderId(),
                rentalEntity.getCarId(),
                rentalEntity.getRealDeliveryAddress(),
                rentalEntity.getRealDeliveryDate(),
                rentalEntity.getRealDeliveryTime(),
                rentalEntity.getScanOfTheContractUrl(),
                rentalEntity.getScansOfTheRegulationsUrls(),
                rentalEntity.getScanOfTheDeliveryProtocolUrl(),
                rentalEntity.getDeliveryPhotosUrls(),
                rentalEntity.getRealReturnAddress(),
                rentalEntity.getRealReturnDate(),
                rentalEntity.getRealReturnTime(),
                rentalEntity.getReturnPhotosUrls(),
                rentalEntity.getScanOfTheReturnProtocolUrl(),
                rentalEntity.getDamageIds()
        );
    }

    public RentalEntity convertRentalToRentalEntity(Rental rental) {
        return new RentalEntity(
                rental.getId(),
                rental.getArchive(),
                rental.getOrderId(),
                rental.getCarId(),
                rental.getRealDeliveryAddress(),
                rental.getRealDeliveryDate(),
                rental.getRealDeliveryTime(),
                rental.getScanOfTheContractUrl(),
                rental.getScansOfTheRegulationsUrls(),
                rental.getScanOfTheDeliveryProtocolUrl(),
                rental.getDeliveryPhotosUrls(),
                rental.getRealReturnAddress(),
                rental.getRealReturnDate(),
                rental.getRealReturnTime(),
                rental.getReturnPhotosUrls(),
                rental.getScanOfTheReturnProtocolUrl(),
                rental.getDamageIds()
        );
    }
}
