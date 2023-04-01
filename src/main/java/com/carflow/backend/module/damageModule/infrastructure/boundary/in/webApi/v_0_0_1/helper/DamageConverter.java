package com.carflow.backend.module.damageModule.infrastructure.boundary.in.webApi.v_0_0_1.helper;

import com.carflow.backend.module.damageModule.domain.model.Damage;
import com.carflow.backend.module.damageModule.infrastructure.boundary.in.webApi.v_0_0_1.model.DamageDto;
import org.springframework.stereotype.Service;

@Service
public class DamageConverter {
    public Damage convertDamageDtoToDamage(DamageDto damageDto) {
        Damage damage = new Damage();
        damage.setId(damageDto.getId());
        damage.setArchived(damageDto.getArchived());
        damage.setDamageType(damageDto.getDamageType());
        damage.setDescription(damageDto.getDescription());
        damage.setAttachmentIds(damageDto.getAttachmentIds());
        return damage;
    }

    public DamageDto convertDamageToDamageDto(Damage damage) {
        DamageDto damageDto = new DamageDto();
        damageDto.setId(damage.getId());
        damageDto.setArchived(damage.getArchived());
        damageDto.setDamageType(damage.getDamageType());
        damageDto.setDescription(damage.getDescription());
        damage.setAttachmentIds(damage.getAttachmentIds());
        return damageDto;
    }
}
