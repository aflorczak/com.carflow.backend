package com.carflow.backend.module.orderModule.infrastructure.boundary.in.webApi.v_0_0_1.controller;

import com.carflow.backend.module.orderModule.domain.service.OrderService;
import com.carflow.backend.module.orderModule.infrastructure.boundary.in.webApi.v_0_0_1.entity.OrderDto;
import com.carflow.backend.module.orderModule.infrastructure.boundary.in.webApi.v_0_0_1.helper.OrderApiConverter;
import com.carflow.backend.module.orderModule.domain.model.Order;
import com.carflow.backend.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v-0.0.1/orders")
public class OrderRestApi {

    private OrderService orderService;
    private OrderApiConverter orderApiConverter;
    @Autowired
    public OrderRestApi(OrderService orderService, OrderApiConverter orderApiConverter) {
        this.orderService = orderService;
        this.orderApiConverter = orderApiConverter;
    }

    @PostMapping()
    public OrderDto createNewOrder(@RequestBody OrderDto orderRequest) {
        Order order = orderService.createNewOrder(orderApiConverter.convertOrderDtoToOrder(orderRequest));
        return orderApiConverter.convertOrderToOrderDto(order);
    }

    @GetMapping()
    public List<OrderDto> getOrders(@RequestParam(defaultValue = "ACCEPTED,CANCELLED,IN_PROGRESS,RETURNED,WAITOING_FOR_PAYMENT,ENDED") String statuses) {
        final List<String> paramsList = Arrays.stream(statuses.split(",")).toList();
        List<Order> orders = orderService.getOrders(paramsList);

        return orders.stream().map(order -> orderApiConverter.convertOrderToOrderDto(order)).toList();
    }

    @GetMapping("/{id}")
    public OrderDto getOrderById(@PathVariable String id)  throws ObjectNotFoundException {
        Order order = orderService.getOrderById(id);
        return orderApiConverter.convertOrderToOrderDto(order);
    }

    @PutMapping("/{id}")
    public OrderDto updateOrderById(@PathVariable String id, @RequestBody Order order) throws ObjectNotFoundException{
        Order orderResponse = orderService.updateOrderById(id, order);
        return orderApiConverter.convertOrderToOrderDto(orderResponse);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderById(@PathVariable String id) throws ObjectNotFoundException {
        orderService.deleteOrderById(id);
    }
}
