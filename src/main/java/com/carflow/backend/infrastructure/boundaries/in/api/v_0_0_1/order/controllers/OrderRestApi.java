package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.order.controllers;

import com.carflow.backend.domains.order.entities.Order;
import com.carflow.backend.domains.order.services.OrderService;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.order.entities.OrderDto;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.order.helpers.OrderConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v-0.0.1")
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
        OrderDto orderDto = orderConverter.convertOrderToOrderDto(order);
        return orderDto;
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders(@RequestParam(defaultValue = "ACCEPTED,CANCELLED,IN_PROGRESS,RETURNED,WAITOING_FOR_PAYMENT,ENDED") String statuses) {
        final List<String> paramsList = Arrays.stream(statuses.split(",")).toList();
        List<Order> orders = orderService.getOrders(paramsList);

        return orders.stream().map(order -> orderConverter.convertOrderToOrderDto(order)).toList();
    }

    @GetMapping("/orders/{id}")
    public OrderDto getOrderById(@PathVariable String id)  throws ObjectNotFoundException {
        Order order = orderService.getOrderById(id);
        return orderConverter.convertOrderToOrderDto(order);
    }

    @PutMapping("/orders/{id}")
    public OrderDto updateOrderById(@PathVariable String id, @RequestBody Order order) throws ObjectNotFoundException{
        Order orderResponse = orderService.updateOrderById(id, order);
        return orderConverter.convertOrderToOrderDto(orderResponse);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrderById(@PathVariable String id) throws ObjectNotFoundException {
        orderService.deleteOrderById(id);
    }
}
