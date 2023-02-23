package com.carflow.backend.infrastructure.boundaries.in.order.controllers;

import com.carflow.backend.domains.order.entities.Order;
import com.carflow.backend.domains.order.services.OrderService;
import com.carflow.backend.infrastructure.boundaries.in.order.entities.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

//    @GetMapping("/orders")
//    public List<OrderDto> getAllOrders() {
//        List<Order> orders = orderService.getAllOrders();
//
//
//        List<OrderDto> ordersResponse = orders.stream().map(order -> new OrderDto(
//                order.getId(),
//                order.getStatus(),
//                order.getPrincipal(),
//                order.getCaseNumber(),
//                order.getDeliveryAddress(),
//                order.getDeliveryTime(),
//                order.getReturnAddress(),
//                order.getReturnTime(),
//                order.getDrivers(),
//                order.getComments(),
//                order.getSegment()
//        )).toList();
//
//        return ordersResponse;
//    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders(@RequestParam(defaultValue = "ALL") String status) {
        List<Order> orders = new ArrayList<Order>();
        if (Objects.equals(status, "ALL")){
            orders = orderService.getAllOrders();
        } else {
            orders = orderService.getOrdersWithStatus(String.valueOf(status));
        }


        List<OrderDto> ordersResponse = orders.stream().map(order -> new OrderDto(
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

        return ordersResponse;
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

    @DeleteMapping("/orders/{id}")
    public void deleteOrderById(@PathVariable String id) {
        orderService.deleteOrderById(id);
    }
}
