package com.carflow.backend.module.damageModule.domain.model;

import com.carflow.backend.customEnum.DamageType;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public class Damage {
    private Integer id;
    private DamageType damageType;
    private String description;
    private List<AttachmentEntity> attachment;

    public Damage(Integer id, DamageType damageType, String description, List<AttachmentEntity> attachment) {
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
