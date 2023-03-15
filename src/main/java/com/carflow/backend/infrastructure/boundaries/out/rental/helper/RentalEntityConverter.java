package com.carflow.backend.infrastructure.boundaries.out.rental.helper;

import com.carflow.backend.domains.rental.model.Rental;
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
                rentalEntity.getActualDeliveryAddress(),
                rentalEntity.getActualDeliveryDateTime(),
                rentalEntity.getScanOfTheContractUrl(),
                rentalEntity.getScansOfTheRegulationsUrls(),
                rentalEntity.getScanOfTheDeliveryProtocolUrl(),
                rentalEntity.getDeliveryPhotosUrls(),
                rentalEntity.getActualReturnAddress(),
                rentalEntity.getActualReturnDateTime(),
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
                rental.getActualDeliveryAddress(),
                rental.getActualDeliveryDateTime(),
                rental.getScanOfTheContractUrl(),
                rental.getScansOfTheRegulationsUrls(),
                rental.getScanOfTheDeliveryProtocolUrl(),
                rental.getDeliveryPhotosUrls(),
                rental.getActualReturnAddress(),
                rental.getActualReturnDateTime(),
                rental.getReturnPhotosUrls(),
                rental.getScanOfTheReturnProtocolUrl(),
                rental.getDamageIds()
        );
    }
}
