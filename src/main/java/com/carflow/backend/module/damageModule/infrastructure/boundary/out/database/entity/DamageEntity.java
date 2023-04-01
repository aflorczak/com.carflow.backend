package com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.entity;

import com.carflow.backend.customEnum.DamageType;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class DamageEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private Boolean isArchived;
    private DamageType damageType;
    private String description;
    private List<String> attachmentIds;

    public DamageEntity() {
    }

    public DamageEntity(Integer id, Boolean isArchived, DamageType damageType, String description, List<String> attachmentIds) {
        this.id = id;
        this.isArchived = isArchived;
        this.damageType = damageType;
        this.description = description;
        this.attachmentIds = attachmentIds;
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

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getAttachmentIds() {
        return attachmentIds;
    }

    public void setAttachmentIds(List<String> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }
}
