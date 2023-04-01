package com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.entity;

import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import com.carflow.backend.module.carModule.infrastructure.boundary.out.database.entity.CarEntity;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.entity.OrderEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class RentalEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private Boolean isArchived;
    private String orderId;
    private String carId;
    private List<String> attachmentsIds;
    private String deliveryOperationId;
    private String returnOperationId;

    public RentalEntity() {
    }

    public RentalEntity(Integer id, Boolean isArchived, String orderId, String carId, List<String> attachmentsIds, String deliveryOperationId, String returnOperationId) {
        this.id = id;
        this.isArchived = isArchived;
        this.orderId = orderId;
        this.carId = carId;
        this.attachmentsIds = attachmentsIds;
        this.deliveryOperationId = deliveryOperationId;
        this.returnOperationId = returnOperationId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getArchived() {
        return isArchived;
    }

    public void setArchived(Boolean archived) {
        isArchived = archived;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public List<String> getAttachmentsIds() {
        return attachmentsIds;
    }

    public void setAttachmentsIds(List<String> attachmentsIds) {
        this.attachmentsIds = attachmentsIds;
    }

    public String getDeliveryOperationId() {
        return deliveryOperationId;
    }

    public void setDeliveryOperationId(String deliveryOperationId) {
        this.deliveryOperationId = deliveryOperationId;
    }

    public String getReturnOperationId() {
        return returnOperationId;
    }

    public void setReturnOperationId(String returnOperationId) {
        this.returnOperationId = returnOperationId;
    }
}
