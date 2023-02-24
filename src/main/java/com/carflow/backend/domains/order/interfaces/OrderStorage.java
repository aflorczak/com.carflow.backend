package com.carflow.backend.domains.order.interfaces;

import com.carflow.backend.domains.order.entities.Order;

import java.util.List;

public interface OrderStorage {
    Order createNewOrder(Order order);
    List<Order> getAllOrders();
    List<Order> getOrders(List<String> statuses);
    Order getOrderById(String id);
    Order updateOrderById(String id, Order order);
    void deleteOrderById(String id);
}
