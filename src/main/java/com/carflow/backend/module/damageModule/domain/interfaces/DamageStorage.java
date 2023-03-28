package com.carflow.backend.module.damageModule.domain.interfaces;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.carModule.domain.model.Car;
import com.carflow.backend.module.damageModule.domain.model.Damage;

import java.util.List;

public interface DamageStorage {
    Damage createNewDamage(Damage damage);
    List<Damage> getAllDamages();
    Damage getDamageById(String id) throws ObjectNotFoundException;
    Damage updateDamageById(String id, Damage updatedDamage) throws ObjectNotFoundException;
    void deleteDamageById(String id) throws ObjectNotFoundException;
}
