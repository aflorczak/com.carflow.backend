package com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.helper;

import com.carflow.backend.module.damageModule.domain.model.Damage;
import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.entity.DamageEntity;

public class DamageEntityConverter {
    public DamageEntity convertDamageToDamageEntity(Damage damage) {
        return new DamageEntity(
                damage.getId(),
                damage.getDamageType(),
                damage.getDescription(),
                damage.getAttachment()
        );
    }

    public Damage convertDamageEntityToDamage(DamageEntity damageEntity) {
        return new Damage(
                damageEntity.getId(),
                damageEntity.getDamageType(),
                damageEntity.getDescription(),
                damageEntity.getAttachment()
        );
    }
}
