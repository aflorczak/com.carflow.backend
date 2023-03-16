package com.carflow.backend.infrastructure.boundaries.out.damage.entity;

import com.carflow.backend.enums.DamageTypes;
import com.carflow.backend.infrastructure.boundaries.out.attachment.entity.AttachmentEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class DamageEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private DamageTypes damageTypes;
    private String description;
    @OneToMany
    private List<AttachmentEntity> attachment;
}
