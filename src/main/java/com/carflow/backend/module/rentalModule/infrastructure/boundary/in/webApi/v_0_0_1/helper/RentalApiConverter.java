package com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.helper;


import com.carflow.backend.module.rentalModule.domain.model.Rental;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.model.RentalDto;
import org.springframework.stereotype.Service;

@Service
public class RentalApiConverter {
    public Rental convertRentalDtoToRental(RentalDto rentalDto) {
        Rental rental = new Rental();
        rental.setId(rentalDto.getId());
        rental.setArchived(rentalDto.getArchived());
        rental.setOrderId(rentalDto.getOrderId());
        rental.setCarId(rentalDto.getCarId());
        rental.setAttachmentsIds(rentalDto.getAttachmentsIds());
        rental.setDeliveryOperationId(rentalDto.getDeliveryOperationId());
        rental.setReturnOperationId(rentalDto.getReturnOperationId());
        return rental;
    }

    public RentalDto convertRentalToRentalDto(Rental rental) {
        RentalDto rentalDto = new RentalDto();
        rentalDto.setId(rental.getId());
        rentalDto.setArchived(rental.getArchived());
        rentalDto.setOrderId(rental.getOrderId());
        rentalDto.setCarId(rental.getCarId());
        rentalDto.setAttachmentsIds(rental.getAttachmentsIds());
        rentalDto.setDeliveryOperationId(rental.getDeliveryOperationId());
        rentalDto.setReturnOperationId(rental.getReturnOperationId());
        return rentalDto;
    }
}
