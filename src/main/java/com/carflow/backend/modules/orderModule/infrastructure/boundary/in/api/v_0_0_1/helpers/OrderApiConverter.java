package com.carflow.backend.modules.orderModule.infrastructure.boundary.in.api.v_0_0_1.helpers;

import com.carflow.backend.modules.orderModule.infrastructure.boundary.in.api.v_0_0_1.entities.OrderDto;
import com.carflow.backend.modules.orderModule.domain.models.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderApiConverter {
    public Order convertOrderDtoToOrder(OrderDto orderDto) {
        return new Order(
                orderDto.getId(),
                orderDto.getStatus(),
                orderDto.getClientsData(),
                orderDto.getPrincipal(),
                orderDto.getInternalCaseNumber(),
                orderDto.getExternalCaseNumber(),
                orderDto.getSegment(),
                orderDto.getDeliveryAddress(),
                orderDto.getDeliveryDate(),
                orderDto.getDeliveryTime(),
                orderDto.getDeliveryComments(),
                orderDto.getDeliveryBranch(),
                orderDto.getReturnAddress(),
                orderDto.getReturnDate(),
                orderDto.getReturnTime(),
                orderDto.getReturnComments(),
                orderDto.getReturnBranch(),
                orderDto.getArchive(),
                orderDto.getReasonForCancelingTheOrder()
        );
    }

    public OrderDto convertOrderToOrderDto(Order order) {
        return new OrderDto(
                order.getId(),
                order.getStatus(),
                order.getClientsData(),
                order.getPrincipal(),
                order.getInternalCaseNumber(),
                order.getExternalCaseNumber(),
                order.getSegment(),
                order.getDeliveryAddress(),
                order.getDeliveryDate(),
                order.getDeliveryTime(),
                order.getDeliveryComments(),
                order.getDeliveryBranch(),
                order.getReturnAddress(),
                order.getReturnDate(),
                order.getReturnTime(),
                order.getReturnComments(),
                order.getReturnBranch(),
                order.getArchive(),
                order.getReasonForCancelingTheOrder()
        );
    }



}
