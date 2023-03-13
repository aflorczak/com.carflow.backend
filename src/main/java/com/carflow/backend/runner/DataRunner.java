package com.carflow.backend.runner;

import com.carflow.backend.infrastructure.boundaries.out.order.repository.OrderRepository;
import com.carflow.backend.infrastructure.boundaries.out.order.entity.OrderEntity;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class DataRunner implements ApplicationRunner {

    private final OrderRepository repo;

    public DataRunner(OrderRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        OrderEntity orderEntity = new OrderEntity(
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
        repo.save(orderEntity);
    }
}
