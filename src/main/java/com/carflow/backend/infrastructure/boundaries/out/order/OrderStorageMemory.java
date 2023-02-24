package com.carflow.backend.infrastructure.boundaries.out.order;

import com.carflow.backend.domains.order.entities.Order;
import com.carflow.backend.domains.order.interfaces.OrderStorage;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class OrderStorageMemory implements OrderStorage {
    private HashMap<String, Order> orders = new HashMap<String, Order>();
    private Integer nextId = 0;

    public OrderStorageMemory() {
        createNewOrder(
                new Order(
                        nextId + 1,
                        "ACCEPTED",
                        "PZU",
                        "ZA230223000047",
                        "ul.Narutowicza 4, 50-522 Nibylandia",
                        "08:00",
                        "ul.Narutowicza 4, 50-522 Nibylandia",
                        "08:00",
                        "Maciej Bogacz, Justyna Bogacz",
                        "Tutaj wpisujemy wszystkie komentarze do sprawy.",
                        null,
                        "C"
                )
        );
    }

    @Override
    public Order createNewOrder(Order order) {
        String id = (++nextId).toString();
        orders.put(
                id,
                new Order(
                        nextId,
                        order.getStatus(),
                        order.getPrincipal(),
                        order.getCaseNumber(),
                        order.getDeliveryAddress(),
                        order.getDeliveryTime(),
                        order.getReturnAddress(),
                        order.getReturnTime(),
                        order.getDrivers(),
                        order.getComments(),
                        order.getReasonForCancelingTheOrder(),
                        order.getSegment()
                )
        );
        Order orderResponse = orders.get(id);
        return orderResponse;
    }

    @Override
    public List<Order> getAllOrders() {
        return orders.values().stream().toList();
    }

    @Override
    public List<Order> getOrders(List<String> statuses) {
        return orders.values().stream().filter(order ->  statuses.contains(order.getStatus())).toList();
    }

    @Override
    public Order getOrderById(String id) {
        return orders.get(id);
    }

    @Override
    public Order updateOrderById(String id, Order order) {
        orders.remove(id);
        return orders.put(id, order);
    }

    @Override
    public void deleteOrderById(String id) {
        orders.remove(id);
    }
}
