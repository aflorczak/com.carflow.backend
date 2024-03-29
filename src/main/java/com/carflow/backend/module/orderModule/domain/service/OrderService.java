package com.carflow.backend.module.orderModule.domain.service;

import com.carflow.backend.module.orderModule.domain.interfaces.OrderStorage;
import com.carflow.backend.module.orderModule.domain.model.Order;
import com.carflow.backend.exception.ObjectNotFoundException;
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

    public void deleteOrderById(String id) throws ObjectNotFoundException {
        storage.deleteOrderById(id);
    }
}
