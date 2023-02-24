package com.carflow.backend.infrastructure.boundaries.in.order.controllers;

import com.carflow.backend.domains.order.entities.Order;
import com.carflow.backend.domains.order.services.OrderService;
import com.carflow.backend.infrastructure.boundaries.in.order.entities.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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
                        orderRequest.getStatus(),
                        orderRequest.getPrincipal(),
                        orderRequest.getCaseNumber(),
                        orderRequest.getDeliveryAddress(),
                        orderRequest.getDeliveryTime(),
                        orderRequest.getReturnAddress(),
                        orderRequest.getReturnTime(),
                        orderRequest.getDrivers(),
                        orderRequest.getComments(),
                        orderRequest.getSegment()
                )
        );

        OrderDto orderResponse = new OrderDto(
                order.getId(),
                order.getStatus(),
                order.getPrincipal(),
                order.getCaseNumber(),
                order.getDeliveryAddress(),
                order.getDeliveryTime(),
                order.getReturnAddress(),
                order.getReturnTime(),
                order.getDrivers(),
                order.getComments(),
                order.getSegment()
        );

        return orderResponse;
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders(@RequestParam(defaultValue = "ACCEPTED,CANCELLED,IN_PROGRESS,RETURNED,WAITOING_FOR_PAYMENT,ENDED") String statuses) {
        final List<String> paramsList = Arrays.stream(statuses.split(",")).toList();
        List<Order> orders = orderService.getOrders(paramsList);


        return orders.stream().map(order -> new OrderDto(
                order.getId(),
                order.getStatus(),
                order.getPrincipal(),
                order.getCaseNumber(),
                order.getDeliveryAddress(),
                order.getDeliveryTime(),
                order.getReturnAddress(),
                order.getReturnTime(),
                order.getDrivers(),
                order.getComments(),
                order.getSegment()
        )).toList();
    }

    @GetMapping("/orders/{id}")
    public OrderDto getOrderById(@PathVariable String id) {
        Order order = orderService.getOrderById(id);

        if (!(order==null)) {
            return new OrderDto(
                    order.getId(),
                    order.getStatus(),
                    order.getPrincipal(),
                    order.getCaseNumber(),
                    order.getDeliveryAddress(),
                    order.getDeliveryTime(),
                    order.getReturnAddress(),
                    order.getReturnTime(),
                    order.getDrivers(),
                    order.getComments(),
                    order.getSegment()
            );
        } else {
            return null;
        }
    }

    @PutMapping("/orders/{id}")
    public Order updateOrderById(@PathVariable String id, @RequestBody Order order) {
        Order orderResponse = orderService.updateOrderById(id, order);
        if (!(orderResponse == null)) {
            return orderResponse;
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
