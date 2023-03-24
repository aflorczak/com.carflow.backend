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
}
