package com.carflow.backend.infrastructure.boundaries.in.api.forService.v_0_0_1.order.helpers;

import com.carflow.backend.domains.order.entities.Order;
import com.carflow.backend.infrastructure.boundaries.in.api.forService.v_0_0_1.order.entities.OrderDto;
import org.springframework.stereotype.Service;

@Service
public class OrderConverter {
    public Order convertOrderDtoToOrder(OrderDto orderDto) {
        return new Order(
                orderDto.getId(),
                orderDto.getArchive(),
                orderDto.getStatus(),
                orderDto.getPrincipal(),
                orderDto.getCaseNumber(),
                orderDto.getDeliveryAddress(),
                orderDto.getDeliveryTime(),
                orderDto.getReturnAddress(),
                orderDto.getReturnTime(),
                orderDto.getDrivers(),
                orderDto.getComments(),
                orderDto.getReasonForCancelingTheOrder(),
                orderDto.getSegment()
        );
    }

    public OrderDto convertOrderToOrderDto(Order order) {
        return new OrderDto(
                order.getId(),
                order.getArchive(),
                order.getStatus(),
                order.getPrincipal(),
                order.getCaseNumber(),
                order.getDeliveryAddress(),
                order.getDeliveryTime(),
                order.getReturnAddress(),
                order.getReturnTime(),
                order.getDrivers(),
                order.getComments(),
                order.getReasonForCancelingTheOrder(),
                order.getSegment()
        );
    }
}
