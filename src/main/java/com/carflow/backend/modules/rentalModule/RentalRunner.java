package com.carflow.backend.modules.rentalModule;

import com.carflow.backend.modules.carModule.infrastructure.boundary.out.repository.CarRepository;
import com.carflow.backend.modules.orderModule.infrastructure.boundary.out.repository.OrderRepository;
import com.carflow.backend.modules.rentalModule.customEnum.OperationTypes;
import com.carflow.backend.modules.rentalModule.customType.operation.entity.OperationEntity;
import com.carflow.backend.modules.rentalModule.customType.operation.repository.OperationRepository;
import com.carflow.backend.modules.rentalModule.customType.place.entity.PlaceEntity;
import com.carflow.backend.modules.rentalModule.customType.place.repository.PlaceRepository;
import com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.entity.RentalEntity;
import com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.repository.RentalRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RentalRunner implements ApplicationRunner {
    private final RentalRepository rentalRepository;
    private final CarRepository carRepository;
    private final OrderRepository orderRepository;
    private final OperationRepository operationRepository;
    private final PlaceRepository placeRepository;

    public RentalRunner(
            RentalRepository rentalRepository,
            CarRepository carRepository,
            OrderRepository orderRepository,
            OperationRepository operationRepository,
            PlaceRepository placeRepository
    ) {
        this.rentalRepository = rentalRepository;
        this.carRepository = carRepository;
        this.orderRepository = orderRepository;
        this.operationRepository = operationRepository;
        this.placeRepository = placeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        PlaceEntity firstPlace = new PlaceEntity();
        PlaceEntity secondPlace = new PlaceEntity();
        firstPlace.setId(1);
        secondPlace.setId(2);
        firstPlace.setStreet("ul. Wymyslona");
        secondPlace.setStreet("ul. Inna");
        firstPlace.setBuildingNumber("12");
        secondPlace.setBuildingNumber("18");
        firstPlace.setApartmentNumber("1");
        secondPlace.setApartmentNumber("1");
        firstPlace.setPostCode("69-325");
        secondPlace.setPostCode("47-326");
        firstPlace.setCity("Innomiascowe");
        secondPlace.setCity("Swornegacie");
        firstPlace.setCountry("Polska");
        secondPlace.setCountry("Polska");
        placeRepository.save(firstPlace);
        placeRepository.save(secondPlace);

        OperationEntity firstOutOperation = new OperationEntity();
        OperationEntity secondOutOperation = new OperationEntity();
        OperationEntity firstInOperation = new OperationEntity();
        firstOutOperation.setId(1);
        firstOutOperation.setOperationTypes(OperationTypes.DELIVERY_OPERATION);
        firstOutOperation.setOperationAddress(placeRepository.findById("1").get());
        firstOutOperation.setOperationDateTime(LocalDateTime.now());
        firstOutOperation.setAttachments(null);
        firstOutOperation.setDamages(null);

        secondOutOperation.setId(2);
        secondOutOperation.setOperationTypes(OperationTypes.DELIVERY_OPERATION);
        secondOutOperation.setOperationAddress(placeRepository.findById("2").get());
        secondOutOperation.setOperationDateTime(LocalDateTime.now());
        secondOutOperation.setAttachments(null);
        secondOutOperation.setDamages(null);

        firstInOperation.setId(3);
        firstInOperation.setOperationTypes(OperationTypes.RETURN_OPERATION);
        firstInOperation.setOperationAddress(placeRepository.findById("1").get());
        firstInOperation.setOperationDateTime(LocalDateTime.now());
        firstInOperation.setAttachments(null);
        firstInOperation.setDamages(null);

        operationRepository.save(firstOutOperation);
        operationRepository.save(secondOutOperation);
        operationRepository.save(firstInOperation);



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
