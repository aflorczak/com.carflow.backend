package com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.model;

import java.util.List;

public class RentalDto {
    private Integer id;
    private Boolean isArchived;
    private String orderId;
    private String carId;
    private List<String> attachmentsIds;
    private String deliveryOperationId;
    private String returnOperationId;

    public RentalDto() {
    }

    public RentalDto(Integer id, Boolean isArchived, String orderId, String carId, List<String> attachmentsIds, String deliveryOperationId, String returnOperationId) {
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
