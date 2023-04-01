package com.carflow.backend.module.operationModule.domain.model;

import com.carflow.backend.customEnum.OperationType;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.entity.DamageEntity;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.entity.PlaceEntity;

import java.time.LocalDateTime;
import java.util.List;

public class Operation {
    private Integer id;
    private Boolean isArchived;
    private OperationType operationTypes;
    private String operationAddressId;
    private LocalDateTime operationDateTime;
    private List<String> attachmentsIds;
    private List<String> damagesIds;

    public Operation() {
    }

    public Operation(Integer id, Boolean isArchived, OperationType operationTypes, String operationAddressId, LocalDateTime operationDateTime, List<String> attachmentsIds, List<String> damagesIds) {
        this.id = id;
        this.isArchived = isArchived;
        this.operationTypes = operationTypes;
        this.operationAddressId = operationAddressId;
        this.operationDateTime = operationDateTime;
        this.attachmentsIds = attachmentsIds;
        this.damagesIds = damagesIds;
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

    public OperationType getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(OperationType operationTypes) {
        this.operationTypes = operationTypes;
    }

    public String getOperationAddressId() {
        return operationAddressId;
    }

    public void setOperationAddressId(String operationAddressId) {
        this.operationAddressId = operationAddressId;
    }

    public LocalDateTime getOperationDateTime() {
        return operationDateTime;
    }

    public void setOperationDateTime(LocalDateTime operationDateTime) {
        this.operationDateTime = operationDateTime;
    }

    public List<String> getAttachmentsIds() {
        return attachmentsIds;
    }

    public void setAttachmentsIds(List<String> attachmentsIds) {
        this.attachmentsIds = attachmentsIds;
    }

    public List<String> getDamagesIds() {
        return damagesIds;
    }

    public void setDamagesIds(List<String> damagesIds) {
        this.damagesIds = damagesIds;
    }
}
