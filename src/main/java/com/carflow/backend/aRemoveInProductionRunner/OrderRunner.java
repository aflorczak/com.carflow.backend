package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.entity.OrderEntity;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.repository.OrderRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class OrderRunner implements ApplicationRunner {

    private final OrderRepository orderRepository;

    public OrderRunner(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        OrderEntity firstOrder = new OrderEntity();
//
//        firstOrder.setId(1);
//
//        firstOrder.setStatus("ACCEPTED");
//
//        firstOrder.setClientsData("Stefan Wymyslony");
//
//        firstOrder.setPrincipal("PZU");
//
//        firstOrder.setInternalCaseNumber("CF230313000001");
//
//        firstOrder.setExternalCaseNumber("ZA230313000241");
//
//        firstOrder.setSegment("B");
//
//        firstOrder.setDeliveryAddress("ul. Wymylona 51, 52-357 Nibylandia, Polska");
//
//        firstOrder.setDeliveryDate("13-03-2023");
//
//        firstOrder.setDeliveryTime("18:00");
//
//        firstOrder.setDeliveryComments("Jeżeli nie będziemy punktualnie to klient anuluje wydanie.");
//
//        firstOrder.setDeliveryBranch("wroclaw-lotnisko");
//
//
//        firstOrder.setReturnAddress("ul. Wymylona 51, 52-357 Nibylandia, Polska");
//
//        firstOrder.setReturnDate("14-03-2023");
//
//        firstOrder.setReturnTime("18:00");
//
//        firstOrder.setReturnComments(null);
//
//        firstOrder.setReturnBranch("wroclaw-lotnisko");
//
//        firstOrder.setArchive(false);
//
//        firstOrder.setReasonForCancelingTheOrder(null);
//
//        orderRepository.save(firstOrder);
    }
}
