package com.carflow.backend.module.rentalModule.domain.model;

import com.carflow.backend.module.attachmentModule.domain.model.Attachment;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import com.carflow.backend.module.carModule.domain.model.Car;
import com.carflow.backend.module.carModule.infrastructure.boundary.out.database.entity.CarEntity;
import com.carflow.backend.module.operationModule.domain.model.Operation;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
import com.carflow.backend.module.orderModule.domain.model.Order;
import com.carflow.backend.module.orderModule.infrastructure.boundary.in.webApi.v_0_0_1.entity.OrderDto;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.entity.OrderEntity;

import java.util.List;

public class Rental {
    private Integer id;
    private Boolean archived;
    private Order order;
    private Car car;
    private List<Attachment> attachments;
    private Operation deliveryOperation;
    private Operation returnOperation;

    public Rental() {
    }

    public Rental(Integer id, Boolean archived, Order order, Car car, List<Attachment> attachments, Operation deliveryOperation, Operation returnOperation) {
        this.id = id;
        this.archived = archived;
        this.order = order;
        this.car = car;
        this.attachments = attachments;
        this.deliveryOperation = deliveryOperation;
        this.returnOperation = returnOperation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Operation getDeliveryOperation() {
        return deliveryOperation;
    }

    public void setDeliveryOperation(Operation deliveryOperation) {
        this.deliveryOperation = deliveryOperation;
    }

    public Operation getReturnOperation() {
        return returnOperation;
    }

    public void setReturnOperation(Operation returnOperation) {
        this.returnOperation = returnOperation;
    }
}
