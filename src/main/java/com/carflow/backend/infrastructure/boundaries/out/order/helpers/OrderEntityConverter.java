package com.carflow.backend.infrastructure.boundaries.out.order.helpers;

import com.carflow.backend.domains.order.models.Order;
import com.carflow.backend.infrastructure.boundaries.out.order.entity.OrderEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderEntityConverter {
    public OrderEntity convertOrderToOrderEntity(Order order) {
        return new OrderEntity(
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

    public Order convertOrderEntityToOrder(OrderEntity orderEntity) {
        return new Order(
                orderEntity.getId(),
                orderEntity.getStatus(),
                orderEntity.getClientsData(),
                orderEntity.getPrincipal(),
                orderEntity.getInternalCaseNumber(),
                orderEntity.getExternalCaseNumber(),
                orderEntity.getSegment(),
                orderEntity.getDeliveryAddress(),
                orderEntity.getDeliveryDate(),
                orderEntity.getDeliveryTime(),
                orderEntity.getDeliveryComments(),
                orderEntity.getDeliveryBranch(),
                orderEntity.getReturnAddress(),
                orderEntity.getReturnDate(),
                orderEntity.getReturnTime(),
                orderEntity.getReturnComments(),
                orderEntity.getReturnBranch(),
                orderEntity.getArchive(),
                orderEntity.getReasonForCancelingTheOrder()
        );
    }
}
