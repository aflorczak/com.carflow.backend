package com.carflow.backend.runner;

import com.carflow.backend.infrastructure.boundaries.out.cars.entity.CarEntity;
import com.carflow.backend.infrastructure.boundaries.out.cars.repository.CarRepository;
import com.carflow.backend.infrastructure.boundaries.out.order.repository.OrderRepository;
import com.carflow.backend.infrastructure.boundaries.out.order.entity.OrderEntity;
import com.carflow.backend.infrastructure.boundaries.out.rental.entity.RentalEntity;
import com.carflow.backend.infrastructure.boundaries.out.rental.repository.RentalRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class DataRunner implements ApplicationRunner {

    private final OrderRepository orderRepository;
    private final CarRepository carRepository;
    private final RentalRepository rentalRepository;

    public DataRunner(OrderRepository orderRepository, CarRepository carRepository, RentalRepository rentalRepository) {
        this.orderRepository = orderRepository;
        this.carRepository = carRepository;
        this.rentalRepository = rentalRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Runner");
        OrderEntity orderEntity = new OrderEntity(
                1,
                "ACCEPTED",
                "Stefan Wymyslony",
                "PZU",
                "CF230313000001",
                "ZA230313000021",
                "D",
                "ul. Wymylona 51, 52-357 Nibylandia, Polska",
                "13-03-2023",
                "18:00",
                "",
                "wroclaw-lotnisko",
                "ul. Wymylona 51, 52-357 Nibylandia, Polska",
                "13-03-2023",
                "18:00",
                "",
                "wroclaw-lotnisko",
                false,
                ""
        );

        CarEntity carEntity = new CarEntity(
                1,
                false,
                "wroclaw-lotnisko",
                "Opel",
                "Astra",
                524,
                "DIESEL",
                5,
                5,
                "COMBI",
                "C",
                "VIN",
                "DLK 524854",
                "15-05-2023",
                "15-05-2023",
                null,
                null
        );

        RentalEntity rentalEntity = new RentalEntity(
                1,
                false,
                "1",
                1,
                "realny adres dostawy",
                "realna data dostawy",
                "realna godzina dostawy",
                "URL do skanu umowy",
                "URL do skanu regulaminu",
                "URL do skanu protokou dostawy",
                "URLe ze zdjeciami z wydania",
                "realny adres zwrotu",
                "realna data zwrotu",
                "realna godzina zwrotu",
                "URLe ze zdjęciami",
                "URL do skanu protokołu zwrotu",
                null
        );

        rentalRepository.save(rentalEntity);
        carRepository.save(carEntity);
        orderRepository.save(orderEntity);
    }
}
