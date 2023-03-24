package com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.entity;

import com.carflow.backend.modules.rentalModule.customType.attachment.entity.AttachmentEntity;
import com.carflow.backend.modules.carModule.infrastructure.boundary.out.entity.CarEntity;
import com.carflow.backend.modules.rentalModule.customType.operation.entity.OperationEntity;
import com.carflow.backend.modules.orderModule.infrastructure.boundary.out.entity.OrderEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class RentalEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private Boolean archived;
    @OneToOne(fetch = FetchType.LAZY)
    private OrderEntity order;
    @ManyToOne(fetch = FetchType.LAZY)
    private CarEntity car;
    @OneToMany
    private List<AttachmentEntity> attachments;
    @OneToOne
    private OperationEntity deliveryOperation;
    @OneToOne
    private OperationEntity returnOperation;

    public RentalEntity() {
    }

    public RentalEntity(Integer id, Boolean archived, OrderEntity order, CarEntity car, List<AttachmentEntity> attachments, OperationEntity deliveryOperation, OperationEntity returnOperation) {
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

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    public List<AttachmentEntity> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentEntity> attachments) {
        this.attachments = attachments;
    }

    public OperationEntity getDeliveryOperation() {
        return deliveryOperation;
    }

    public void setDeliveryOperation(OperationEntity deliveryOperation) {
        this.deliveryOperation = deliveryOperation;
    }

    public OperationEntity getReturnOperation() {
        return returnOperation;
    }

    public void setReturnOperation(OperationEntity returnOperation) {
        this.returnOperation = returnOperation;
    }

    @Override
    public String toString() {
        return "RentalEntity{" +
                "id=" + id +
                ", archived=" + archived +
                ", order=" + order +
                ", car=" + car +
                ", attachments=" + attachments +
                ", deliveryOperation=" + deliveryOperation +
                ", returnOperation=" + returnOperation +
                '}';
    }
}
