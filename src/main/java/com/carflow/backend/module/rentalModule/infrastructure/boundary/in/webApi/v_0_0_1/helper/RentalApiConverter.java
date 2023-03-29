//package com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.helper;
//
//
//import com.carflow.backend.module.rentalModule.domain.model.Rental;
//import com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.model.RentalDto;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RentalApiConverter {
//    public Rental convertRentalDtoToRental(RentalDto rentalDto) {
//        Rental rental = new Rental();
//        rental.setId(rentalDto.getId());
//        rental.setArchived(rentalDto.getArchived());
//        rental.setOrder(rentalDto.getOrder());
//        rental.setCar(rentalDto.getCar());
//        rental.setAttachments(rentalDto.getAttachments());
//        rental.setDeliveryOperation(rentalDto.getDeliveryOperation());
//        rental.setReturnOperation(rentalDto.getReturnOperation());
//        return rental;
//    }
//
//    public RentalDto convertRentalToRentalDto(Rental rental) {
//        RentalDto rentalDto = new RentalDto();
//        rentalDto.setId(rental.getId());
//        rentalDto.setArchived(rental.getArchived());
//        rentalDto.setOrder(rental.getOrder());
//        rentalDto.setCar(rental.getCar());
//        rentalDto.setAttachments(rental.getAttachments());
//        rentalDto.setDeliveryOperation(rental.getDeliveryOperation());
//        rentalDto.setReturnOperation(rental.getReturnOperation());
//        return rentalDto;
//    }
//}
