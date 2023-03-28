package com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.damageModule.domain.interfaces.DamageStorage;
import com.carflow.backend.module.damageModule.domain.model.Damage;
import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.entity.DamageEntity;
import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.helper.DamageEntityConverter;
import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.repository.DamageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SQLDamageStorage implements DamageStorage {
    private final DamageRepository damageRepository;
    private final DamageEntityConverter converter;

    public SQLDamageStorage(
            DamageRepository damageRepository,
            DamageEntityConverter converter
    ) {
        this.damageRepository = damageRepository;
        this.converter = converter;
    }

    @Override
    public Damage createNewDamage(Damage damage) {
        return converter.convertDamageEntityToDamage(damageRepository.save(converter.convertDamageToDamageEntity(damage)));
    }

    @Override
    public List<Damage> getAllDamages() {
        return damageRepository.findAll().stream().map(converter::convertDamageEntityToDamage).toList();
    }

    @Override
    public Damage getDamageById(String id) throws ObjectNotFoundException {
        Optional<DamageEntity> damageEntity = damageRepository.findById(id);
        if (damageEntity.isPresent()) {
            return converter.convertDamageEntityToDamage(damageEntity.get());
        } else {
            throw new ObjectNotFoundException("Object not found.");
        }
    }

    @Override
    public Damage updateDamageById(String id, Damage updatedDamage) throws ObjectNotFoundException {
        DamageEntity damageEntity = damageRepository.save(converter.convertDamageToDamageEntity(updatedDamage));
        return converter.convertDamageEntityToDamage(damageEntity);
    }

    @Override
    public void deleteDamageById(String id) throws ObjectNotFoundException {
        Optional<DamageEntity> damage = damageRepository.findById(id);
        if (damage.isPresent()) {
            damageRepository.deleteById(id);
        } else {
            throw new ObjectNotFoundException("Object not found.");
        }
    }
}
