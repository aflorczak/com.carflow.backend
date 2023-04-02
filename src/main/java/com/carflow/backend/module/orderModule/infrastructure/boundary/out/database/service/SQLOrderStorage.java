package com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.service;

import com.carflow.backend.module.orderModule.domain.interfaces.OrderStorage;
import com.carflow.backend.module.orderModule.domain.model.Order;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.entity.OrderEntity;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.helper.OrderEntityConverter;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.repository.OrderRepository;
import com.carflow.backend.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SQLOrderStorage implements OrderStorage {
    final private OrderRepository orderRepository;
    final private OrderEntityConverter orderEntityConverter;
    public SQLOrderStorage (OrderRepository orderRepository, OrderEntityConverter orderEntityConverter) {
        this.orderRepository = orderRepository;
        this.orderEntityConverter = orderEntityConverter;
    }
    @Override
    public Order createNewOrder(Order order) {
        OrderEntity requestOrder = orderEntityConverter.convertOrderToOrderEntity(order);
        return orderEntityConverter.convertOrderEntityToOrder(orderRepository.save(requestOrder));
    }

    @Override
    public List<Order> getAllOrders() {
        List<OrderEntity> orders = orderRepository.findAll();
        return orders.stream().map(orderEntityConverter::convertOrderEntityToOrder).toList();
    }

    @Override
    public List<Order> getOrders(List<String> statuses) {
        return orderRepository.findByStatusIn(statuses).stream().map(orderEntityConverter::convertOrderEntityToOrder).toList();
    }

    @Override
    public Order getOrderById(String id) throws ObjectNotFoundException {
        Optional<OrderEntity> order = orderRepository.findById(id);
        if (order.isPresent()) {
            return orderEntityConverter.convertOrderEntityToOrder(order.get());
        } else {
            throw new ObjectNotFoundException("Obiekt nie istnieje.");
        }
    }

    @Override
    public Order updateOrderById(String id, Order order) throws ObjectNotFoundException {
        if (orderRepository.existsById(id)) {
            return orderEntityConverter.convertOrderEntityToOrder(orderRepository.save(orderEntityConverter.convertOrderToOrderEntity(order)));
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }

    @Override
    public void deleteOrderById(String id) throws ObjectNotFoundException {
        if(orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
        } else {
            throw new ObjectNotFoundException("Obiekt nie istnieje.");
        }
    }
}
