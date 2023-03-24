package com.carflow.backend.modules.orderModule;

import com.carflow.backend.modules.orderModule.infrastructure.boundary.out.entity.OrderEntity;
import com.carflow.backend.modules.orderModule.infrastructure.boundary.out.repository.OrderRepository;
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
        OrderEntity firstOrder = new OrderEntity();
        OrderEntity secondOrder = new OrderEntity();

        firstOrder.setId(1);
        secondOrder.setId(2);

        firstOrder.setStatus("ACCEPTED");
        secondOrder.setStatus("ACCEPTED");

        firstOrder.setClientsData("Stefan Wymyslony");
        secondOrder.setClientsData("Leokadia Inna");

        firstOrder.setPrincipal("PZU");
        secondOrder.setPrincipal("LINK4");

        firstOrder.setInternalCaseNumber("CF230313000001");
        secondOrder.setInternalCaseNumber("CF230313000002");

        firstOrder.setExternalCaseNumber("ZA230313000241");
        secondOrder.setExternalCaseNumber("AP230313000024");

        firstOrder.setSegment("B");
        secondOrder.setSegment("C");

        firstOrder.setDeliveryAddress("ul. Wymylona 51, 52-357 Nibylandia, Polska");
        secondOrder.setDeliveryAddress("Aleje Poprzeczne 46/2, 54-574 Innolandia, Polska");

        firstOrder.setDeliveryDate("13-03-2023");
        secondOrder.setDeliveryDate("13-03-2023");

        firstOrder.setDeliveryTime("18:00");
        secondOrder.setDeliveryTime("18:15");

        firstOrder.setDeliveryComments("Jeżeli nie będziemy punktualnie to klient anuluje wydanie.");
        secondOrder.setDeliveryComments(null);

        firstOrder.setDeliveryBranch("wroclaw-lotnisko");
        secondOrder.setDeliveryBranch("gdansk-lotnisko");


        firstOrder.setReturnAddress("ul. Wymylona 51, 52-357 Nibylandia, Polska");
        secondOrder.setReturnAddress("Aleje Poprzeczne 46/2, 54-574 Innolandia, Polska");

        firstOrder.setReturnDate("14-03-2023");
        secondOrder.setReturnDate("16-03-2023");

        firstOrder.setReturnTime("18:00");
        secondOrder.setReturnTime("18:15");

        firstOrder.setReturnComments(null);
        secondOrder.setReturnComments(null);

        firstOrder.setReturnBranch("wroclaw-lotnisko");
        secondOrder.setReturnBranch("gdansk-lotnisko");

        firstOrder.setArchive(false);
        secondOrder.setArchive(false);

        firstOrder.setReasonForCancelingTheOrder(null);
        secondOrder.setReasonForCancelingTheOrder(null);

        orderRepository.save(firstOrder);
        orderRepository.save(secondOrder);
    }
}
