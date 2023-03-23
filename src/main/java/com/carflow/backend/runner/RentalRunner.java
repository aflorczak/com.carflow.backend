package com.carflow.backend.runner;

import com.carflow.backend.infrastructure.boundaries.out.cars.repository.CarRepository;
import com.carflow.backend.infrastructure.boundaries.out.order.repository.OrderRepository;
import com.carflow.backend.infrastructure.boundaries.out.attachment.entity.AttachmentEntity;
import com.carflow.backend.infrastructure.boundaries.out.rental.entity.RentalEntity;
import com.carflow.backend.infrastructure.boundaries.out.attachment.repository.AttachmentRepository;
import com.carflow.backend.infrastructure.boundaries.out.rental.repository.RentalRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalRunner implements ApplicationRunner {
    private final RentalRepository rentalRepository;
    private final OrderRepository orderRepository;
    private final CarRepository carRepository;
    private final AttachmentRepository attachmentRepository;

    public RentalRunner(
            RentalRepository rentalRepository,
            OrderRepository orderRepository,
            CarRepository carRepository,
            AttachmentRepository attachmentRepository
    ) {
        this.rentalRepository = rentalRepository;
        this.orderRepository = orderRepository;
        this.carRepository = carRepository;
        this.attachmentRepository = attachmentRepository;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<AttachmentEntity> attachmentList = new ArrayList<>();
        attachmentList.add(attachmentRepository.findById("1").get());

        RentalEntity rental = new RentalEntity();

        rental.setId(1);
        rental.setArchived(false);
        rental.setOrder(orderRepository.findById("1").get());
        rental.setCar(carRepository.findById("1").get());
        rental.setAttachments(attachmentList);
        rental.setDeliveryOperation(null);
        rental.setReturnOperation(null);

        rentalRepository.save(rental);
    }
}
