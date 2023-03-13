package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.order.controllers;

import com.carflow.backend.domains.order.models.Order;
import com.carflow.backend.domains.order.services.OrderService;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.order.entities.OrderDto;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.order.helpers.OrderApiConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v-0.0.1")
public class OrderRestApi {

    private OrderService orderService;
    private OrderApiConverter orderApiConverter;
    @Autowired
    public OrderRestApi(OrderService orderService, OrderApiConverter orderApiConverter) {
        this.orderService = orderService;
        this.orderApiConverter = orderApiConverter;
    }

    @PostMapping("/orders")
    public OrderDto createNewOrder(@RequestBody OrderDto orderRequest) {
        Order order = orderService.createNewOrder(orderApiConverter.convertOrderDtoToOrder(orderRequest));
        return orderApiConverter.convertOrderToOrderDto(order);
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders(@RequestParam(defaultValue = "ACCEPTED,CANCELLED,IN_PROGRESS,RETURNED,WAITOING_FOR_PAYMENT,ENDED") String statuses) {
        final List<String> paramsList = Arrays.stream(statuses.split(",")).toList();
        List<Order> orders = orderService.getOrders(paramsList);

        return orders.stream().map(order -> orderApiConverter.convertOrderToOrderDto(order)).toList();
    }

    @GetMapping("/orders/{id}")
    public OrderDto getOrderById(@PathVariable String id)  throws ObjectNotFoundException {
        Order order = orderService.getOrderById(id);
        return orderApiConverter.convertOrderToOrderDto(order);
    }

    @PutMapping("/orders/{id}")
    public OrderDto updateOrderById(@PathVariable String id, @RequestBody Order order) throws ObjectNotFoundException{
        Order orderResponse = orderService.updateOrderById(id, order);
        return orderApiConverter.convertOrderToOrderDto(orderResponse);
    }

    @PatchMapping("/orders/{id}/archive")
    public void moveToArchiveById(@PathVariable String id) throws ObjectNotFoundException {
        orderService.moveToArchiveById(id);
    }

    @PatchMapping("/orders/{id}/cancelled")
    public void moveToCancelledById(@PathVariable String id, @RequestBody String cancelledMessage) throws ObjectNotFoundException {
        String[] splitMessage = cancelledMessage.split(":");
        String message = splitMessage[1].replace("}", "").replace("\"", "");
        orderService.moveToCancelledById(id, message);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrderById(@PathVariable String id) throws ObjectNotFoundException {
        orderService.deleteOrderById(id);
    }
}
