//package com.carflow.backend.aRemoveInProductionRunner;
//
//import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.entity.RentalEntity;
//import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.repository.RentalRepository;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Service
//public class RentalRunner implements ApplicationRunner {
//    private final RentalRepository rentalRepository;
//
//    public RentalRunner(RentalRepository rentalRepository) {
//        this.rentalRepository = rentalRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        RentalEntity rental = new RentalEntity();
//        rental.setId(1);
//        rental.setArchived(false);
//        rental.setOrderId("1");
//        rental.setCarId("1");
//        List<String> attachments = new ArrayList<>();
//        attachments.add("1");
//        attachments.add("2");
//        rental.setAttachmentsIds(attachments);
//        rental.setDeliveryOperationId("1");
//        rental.setReturnOperationId("2");
//        rentalRepository.save(rental);
//    }
//}
