package com.carflow.backend.domains.order.services;

import com.carflow.backend.domains.order.models.Order;
import com.carflow.backend.domains.order.interfaces.OrderStorage;
import com.carflow.backend.exceptions.ObjectNotFoundException;
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
    public List<Order> getOrders(List<String> statuses) { return storage.getOrders(statuses); }

    public Order getOrderById(String id) throws ObjectNotFoundException {
        return storage.getOrderById(id);
    }

    public Order updateOrderById(String id, Order order) throws ObjectNotFoundException {
        return storage.updateOrderById(id, order);
    }

    public void moveToArchiveById(String id) throws ObjectNotFoundException {
        storage.moveToArchiveById(id);
    }

    public void moveToCancelledById(String id, String message) throws ObjectNotFoundException {
        storage.moveToCancelledById(id, message);
    }

    public void deleteOrderById(String id) throws ObjectNotFoundException {
        storage.deleteOrderById(id);
    }
}
