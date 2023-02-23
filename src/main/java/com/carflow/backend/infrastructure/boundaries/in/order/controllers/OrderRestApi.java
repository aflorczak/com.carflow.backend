package com.carflow.backend.infrastructure.boundaries.in.order.controllers;

import com.carflow.backend.domains.order.entities.Order;
import com.carflow.backend.domains.order.services.OrderService;
import com.carflow.backend.infrastructure.boundaries.in.order.entities.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderRestApi {

    private OrderService orderService;
    @Autowired
    public OrderRestApi(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public OrderDto createNewOrder(@RequestBody OrderDto orderRequest) {
        Order order = orderService.createNewOrder(
                new Order(
                        orderRequest.getId(),
                        orderRequest.getPrincipal(),
                        orderRequest.getCaseNumber(),
                        orderRequest.getDeliveryAddress(),
                        orderRequest.getDeliveryTime(),
                        orderRequest.getReturnAddress(),
                        orderRequest.getReturnTime(),
                        orderRequest.getDrivers()
                )
        );

        OrderDto orderResponse = new OrderDto(
                order.getId(),
                order.getPrincipal(),
                order.getCaseNumber(),
                order.getDeliveryAddress(),
                order.getDeliveryTime(),
                order.getReturnAddress(),
                order.getReturnTime(),
                order.getDrivers()
        );

        return orderResponse;
    }

    @GetMapping("/orders")
    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        List<OrderDto> ordersResponse = orders.stream().map(order -> new OrderDto(
                order.getId(),
                order.getPrincipal(),
                order.getCaseNumber(),
                order.getDeliveryAddress(),
                order.getDeliveryTime(),
                order.getReturnAddress(),
                order.getReturnTime(),
                order.getDrivers()
        )).toList();

        return ordersResponse;
    }

    @GetMapping("/orders/{id}")
    public OrderDto getOrderById(@PathVariable String id) {
        Order order = orderService.getOrderById(id);
        if (!(order==null)) {
            return new OrderDto(
                    order.getId(),
                    order.getPrincipal(),
                    order.getCaseNumber(),
                    order.getDeliveryAddress(),
                    order.getDeliveryTime(),
                    order.getReturnAddress(),
                    order.getReturnTime(),
                    order.getDrivers()
            );
        } else {
            return null;
        }
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrderById(@PathVariable String id) {
        orderService.deleteOrderById(id);
    }
}
