//package com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.helper;
//
//import com.carflow.backend.module.rentalModule.domain.model.Rental;
//import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.entity.RentalEntity;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RentalEntityConverter {
//    public RentalEntity convertRentalToRentalEntity(Rental rental) {
//        RentalEntity rentalEntity = new RentalEntity();
//        rentalEntity.setId(rental.getId());
//        rentalEntity.setArchived(rental.getArchived());
//        rentalEntity.setOrder(rental.getOrder());
//        rentalEntity.setCar(rental.getCar());
//        rentalEntity.setAttachments(rental.getAttachments());
//        rentalEntity.setDeliveryOperation(rental.getDeliveryOperation());
//        rentalEntity.setReturnOperation(rental.getReturnOperation());
//        return rentalEntity;
//    }
//
//    public Rental convertRentalEntityToRental(RentalEntity rentalEntity) {
//        Rental rental = new Rental();
//        rental.setId(rentalEntity.getId());
//        rental.setArchived(rentalEntity.getArchived());
//        rental.setOrder(rentalEntity.getOrder());
//        rental.setCar(rentalEntity.getCar());
//        rental.setAttachments(rentalEntity.getAttachments());
//        rental.setDeliveryOperation(rentalEntity.getDeliveryOperation());
//        rental.setReturnOperation(rentalEntity.getReturnOperation());
//        return rental;
//    }
//}
