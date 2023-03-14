package com.carflow.backend.runner;

import com.carflow.backend.infrastructure.boundaries.out.cars.entity.CarEntity;
import com.carflow.backend.infrastructure.boundaries.out.cars.repository.CarRepository;
import com.carflow.backend.infrastructure.boundaries.out.order.repository.OrderRepository;
import com.carflow.backend.infrastructure.boundaries.out.order.entity.OrderEntity;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class DataRunner implements ApplicationRunner {

    private final OrderRepository orderRepository;
    private final CarRepository carRepository;

    public DataRunner(OrderRepository orderRepository, CarRepository carRepository) {
        this.orderRepository = orderRepository;
        this.carRepository = carRepository;
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

        carRepository.save(carEntity);
        orderRepository.save(orderEntity);
    }
}
