package com.carflow.backend.modules.rentalModule.customType.damage.entity;

import com.carflow.backend.modules.rentalModule.customEnum.DamageTypes;
import com.carflow.backend.modules.rentalModule.customType.attachment.entity.AttachmentEntity;
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
