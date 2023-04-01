package com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.helper;

import com.carflow.backend.module.rentalModule.domain.model.Rental;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.entity.RentalEntity;
import org.springframework.stereotype.Service;

@Service
public class RentalEntityConverter {
    public RentalEntity convertRentalToRentalEntity(Rental rental) {
        RentalEntity rentalEntity = new RentalEntity();
        rentalEntity.setId(rental.getId());
        rentalEntity.setArchived(rental.getArchived());
        rentalEntity.setOrderId(rental.getOrderId());
        rentalEntity.setCarId(rental.getCarId());
        rentalEntity.setAttachmentsIds(rental.getAttachmentsIds());
        rentalEntity.setDeliveryOperationId(rental.getDeliveryOperationId());
        rentalEntity.setReturnOperationId(rental.getReturnOperationId());
        return rentalEntity;
    }

    public Rental convertRentalEntityToRental(RentalEntity rentalEntity) {
        Rental rental = new Rental();
        rental.setId(rentalEntity.getId());
        rental.setArchived(rentalEntity.getArchived());
        rental.setOrderId(rentalEntity.getOrderId());
        rental.setCarId(rentalEntity.getCarId());
        rental.setAttachmentsIds(rentalEntity.getAttachmentsIds());
        rental.setDeliveryOperationId(rentalEntity.getDeliveryOperationId());
        rental.setReturnOperationId(rentalEntity.getReturnOperationId());
        return rental;
    }
}
