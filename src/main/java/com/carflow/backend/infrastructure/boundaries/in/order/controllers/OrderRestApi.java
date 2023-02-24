package com.carflow.backend.infrastructure.boundaries.in.order.controllers;

import com.carflow.backend.domains.order.entities.Order;
import com.carflow.backend.domains.order.services.OrderService;
import com.carflow.backend.infrastructure.boundaries.in.order.entities.OrderDto;
import com.carflow.backend.infrastructure.boundaries.in.order.helpers.OrderConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class OrderRestApi {

    private OrderService orderService;
    private OrderConverter orderConverter;
    @Autowired
    public OrderRestApi(OrderService orderService, OrderConverter orderConverter) {
        this.orderService = orderService;
        this.orderConverter = orderConverter;
    }

    @PostMapping("/orders")
    public OrderDto createNewOrder(@RequestBody OrderDto orderRequest) {
        Order order = orderService.createNewOrder(orderConverter.convertOrderDtoToOrder(orderRequest));

        OrderDto orderResponse = orderConverter.convertOrderToOrderDto(order);

        return orderResponse;
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders(@RequestParam(defaultValue = "ACCEPTED,CANCELLED,IN_PROGRESS,RETURNED,WAITOING_FOR_PAYMENT,ENDED") String statuses) {
        final List<String> paramsList = Arrays.stream(statuses.split(",")).toList();
        List<Order> orders = orderService.getOrders(paramsList);

        return orders.stream().map(order -> orderConverter.convertOrderToOrderDto(order)).toList();
    }

    @GetMapping("/orders/{id}")
    public OrderDto getOrderById(@PathVariable String id) {
        Order order = orderService.getOrderById(id);

        if (!(order==null)) {
            return orderConverter.convertOrderToOrderDto(order);
        } else {
            return null;
        }
    }

    @PutMapping("/orders/{id}")
    public OrderDto updateOrderById(@PathVariable String id, @RequestBody Order order) {
        Order orderResponse = orderService.updateOrderById(id, order);
        if (!(orderResponse == null)) {
            return orderConverter.convertOrderToOrderDto(orderResponse);
        } else  {
            // tutaj 404 zrobić :)
            return null;
        }
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrderById(@PathVariable String id) {
        orderService.deleteOrderById(id);
    }
}
