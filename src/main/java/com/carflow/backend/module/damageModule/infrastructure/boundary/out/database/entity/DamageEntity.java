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
    private DamageType damageType;
    private String description;
    @OneToMany
    private List<AttachmentEntity> attachment;

    public DamageEntity() {
    }

    public DamageEntity(Integer id, DamageType damageType, String description, List<AttachmentEntity> attachment) {
        this.id = id;
        this.damageType = damageType;
        this.description = description;
        this.attachment = attachment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<AttachmentEntity> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<AttachmentEntity> attachment) {
        this.attachment = attachment;
    }
}
