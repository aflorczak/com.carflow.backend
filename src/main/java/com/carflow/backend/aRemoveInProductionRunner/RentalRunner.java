package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.module.carModule.infrastructure.boundary.out.database.repository.CarRepository;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.repository.OrderRepository;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.repository.OperationRepository;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.entity.RentalEntity;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.repository.RentalRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;


@Service
public class RentalRunner implements ApplicationRunner {
    private final RentalRepository rentalRepository;
    private final CarRepository carRepository;
    private final OrderRepository orderRepository;
    private final OperationRepository operationRepository;

    public RentalRunner(
            RentalRepository rentalRepository,
            CarRepository carRepository,
            OrderRepository orderRepository,
            OperationRepository operationRepository
    ) {
        this.rentalRepository = rentalRepository;
        this.carRepository = carRepository;
        this.orderRepository = orderRepository;
        this.operationRepository = operationRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        RentalEntity firstRental = new RentalEntity();
        RentalEntity secondRental = new RentalEntity();

        firstRental.setId(1);
        secondRental.setId(2);

        firstRental.setArchived(false);
        secondRental.setArchived(false);

        firstRental.setOrder(orderRepository.findById("1").get());
        secondRental.setOrder(orderRepository.findById("2").get());

        firstRental.setCar(carRepository.findById("1").get());
        secondRental.setCar(carRepository.findById("2").get());

        firstRental.setAttachments(null);
        secondRental.setAttachments(null);

        firstRental.setDeliveryOperation(operationRepository.findById("1").get());
        secondRental.setDeliveryOperation(operationRepository.findById("2").get());

        firstRental.setReturnOperation(operationRepository.findById("3").get());
        secondRental.setReturnOperation(null);

        rentalRepository.save(firstRental);
        rentalRepository.save(secondRental);
    }
}
