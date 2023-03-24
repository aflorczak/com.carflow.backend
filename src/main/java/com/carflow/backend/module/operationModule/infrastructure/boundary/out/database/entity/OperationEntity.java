package com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity;

import com.carflow.backend.customEnum.OperationTypes;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.entity.DamageEntity;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.entity.PlaceEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class OperationEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private OperationTypes operationTypes;
    @OneToOne
    private PlaceEntity operationAddress;
    private LocalDateTime operationDateTime;
    @OneToMany
    private List<AttachmentEntity> attachments;
    @OneToMany
    private List<DamageEntity> damages;

    public OperationEntity() {
    }

    public OperationEntity(Integer id, OperationTypes operationTypes, PlaceEntity operationAddress, LocalDateTime operationDateTime, List<AttachmentEntity> attachments, List<DamageEntity> damages) {
        this.id = id;
        this.operationTypes = operationTypes;
        this.operationAddress = operationAddress;
        this.operationDateTime = operationDateTime;
        this.attachments = attachments;
        this.damages = damages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OperationTypes getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(OperationTypes operationTypes) {
        this.operationTypes = operationTypes;
    }

    public PlaceEntity getOperationAddress() {
        return operationAddress;
    }

    public void setOperationAddress(PlaceEntity operationAddress) {
        this.operationAddress = operationAddress;
    }

    public LocalDateTime getOperationDateTime() {
        return operationDateTime;
    }

    public void setOperationDateTime(LocalDateTime operationDateTime) {
        this.operationDateTime = operationDateTime;
    }

    public List<AttachmentEntity> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentEntity> attachments) {
        this.attachments = attachments;
    }

    public List<DamageEntity> getDamages() {
        return damages;
    }

    public void setDamages(List<DamageEntity> damages) {
        this.damages = damages;
    }
}
