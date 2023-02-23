package com.carflow.backend.domains.order.services;

import com.carflow.backend.domains.order.entities.Order;
import com.carflow.backend.domains.order.interfaces.out.OrderStorage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderStorage storage;

    public OrderService(OrderStorage storage) {
        this.storage = storage;
    }

    public Order createNewOrder(Order order) {
        return storage.createNewOrder(order);
    }

    public List<Order> getAllOrders() {
        return storage.getAllOrders();
    }

    public Order getOrderById(String id) {
        return storage.getOrderById(id);
    }

    public void deleteOrderById(String id) {
        storage.deleteOrderById(id);
    }
}
