package com.carflow.backend.module.damageModule.domain.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.damageModule.domain.interfaces.DamageStorage;
import com.carflow.backend.module.damageModule.domain.model.Damage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DamageService {
    private final DamageStorage storage;

    public DamageService(DamageStorage storage) {
        this.storage = storage;
    }

    public Damage createNewDamage(Damage damage) {
        return storage.createNewDamage(damage);
    }

    public List<Damage> getAllDamages() {
        return storage.getAllDamages();
    }

    public Damage getDamageById(String id) throws ObjectNotFoundException {
        return storage.getDamageById(id);
    }

    public Damage updateDamageById(String id, Damage damage) throws ObjectNotFoundException {
        return storage.updateDamageById(id, damage);
    }

    public void deleteDamageById(String id) throws ObjectNotFoundException {
        storage.deleteDamageById(id);
    }
}
