package com.carflow.backend.module.orderModule.domain.interfaces;

import com.carflow.backend.module.orderModule.domain.model.Order;
import com.carflow.backend.exception.ObjectNotFoundException;

import java.util.List;

public interface OrderStorage {
    Order createNewOrder(Order order);
    List<Order> getAllOrders();
    List<Order> getOrders(List<String> statuses);
    Order getOrderById(String id) throws ObjectNotFoundException;
    Order updateOrderById(String id, Order order) throws ObjectNotFoundException;
    void moveToArchiveById(String id) throws ObjectNotFoundException;
    void deleteOrderById(String id) throws ObjectNotFoundException;
}
