package com.carflow.backend.domains.order.interfaces;

import com.carflow.backend.domains.order.models.Order;
import com.carflow.backend.exceptions.ObjectNotFoundException;

import java.util.List;

public interface OrderStorage {
    Order createNewOrder(Order order);
    List<Order> getAllOrders();
    List<Order> getOrders(List<String> statuses);
    Order getOrderById(String id) throws ObjectNotFoundException;
    Order updateOrderById(String id, Order order) throws ObjectNotFoundException;
    void moveToArchiveById(String id) throws ObjectNotFoundException;
    void moveToCancelledById(String id, String message) throws ObjectNotFoundException;
    void deleteOrderById(String id) throws ObjectNotFoundException;
}
