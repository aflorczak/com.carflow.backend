package com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.service;

import com.carflow.backend.module.orderModule.domain.interfaces.OrderStorage;
import com.carflow.backend.module.orderModule.domain.models.Order;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.entity.OrderEntity;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.helpers.OrderEntityConverter;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.repository.OrderRepository;
import com.carflow.backend.exception.ObjectNotFoundException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Profile("sqlStorage")
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
        return orderEntityConverter.convertOrderEntityToOrder(orderRepository.save(orderEntityConverter.convertOrderToOrderEntity(order)));
    }

    @Override
    public void moveToArchiveById(String id) throws ObjectNotFoundException {
        Optional<OrderEntity> order = orderRepository.findById(id);
        if (order.isPresent()) {
            order.get().setArchive(true);
            orderRepository.save(order.get());
        } else {
            throw new ObjectNotFoundException("Obiekt nie istnieje.");
        }
    }

    @Override
    public void moveToCancelledById(String id, String message) throws ObjectNotFoundException {
        Optional<OrderEntity> order = orderRepository.findById(id);
        if (order.isPresent()) {
            order.get().setStatus("CANCELLED");
            order.get().setReasonForCancelingTheOrder(message);
            orderRepository.save(order.get());
        } else {
            throw new ObjectNotFoundException("Obiekt nie istnieje.");
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
