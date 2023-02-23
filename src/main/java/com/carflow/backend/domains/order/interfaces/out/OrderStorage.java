package com.carflow.backend.domains.order.interfaces.out;

import com.carflow.backend.domains.order.entities.Order;

import java.util.List;

public interface OrderStorage {
    Order createNewOrder(Order order);
    List<Order> getAllOrders();
    List<Order> getOrdersWithStatus(String status);
    Order getOrderById(String id);
    void deleteOrderById(String id);
}
