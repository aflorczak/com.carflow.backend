package com.carflow.backend.module.damageModule.infrastructure.boundary.in.webApi.v_0_0_1.controller;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.damageModule.domain.model.Damage;
import com.carflow.backend.module.damageModule.domain.service.DamageService;
import com.carflow.backend.module.damageModule.infrastructure.boundary.in.webApi.v_0_0_1.helper.DamageConverter;
import com.carflow.backend.module.damageModule.infrastructure.boundary.in.webApi.v_0_0_1.model.DamageDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1")
public class DamageRestApi {
    private final DamageService damageService;
    private final DamageConverter damageConverter;

    public DamageRestApi(DamageService damageService, DamageConverter damageConverter) {
        this.damageService = damageService;
        this.damageConverter = damageConverter;
    }

    @PostMapping("/damages")
    public DamageDto createNewDamage(@RequestBody DamageDto newDamage) {
        Damage damage = damageService.createNewDamage(damageConverter.convertDamageDtoToDamage(newDamage));
        return damageConverter.convertDamageToDamageDto(damage);
    }

    @GetMapping("/damages")
    public List<DamageDto> getAllDamages() {
        return damageService.getAllDamages().stream().map(damageConverter::convertDamageToDamageDto).toList();
    }

    @GetMapping("/damages/{id}")
    public DamageDto getDamageById(@PathVariable String id) throws ObjectNotFoundException {
        Damage damage = damageService.getDamageById(id);
        return damageConverter.convertDamageToDamageDto(damage);
    }

    @PostMapping("/damages/{id}")
    public DamageDto updateDamageById(@PathVariable String id, DamageDto damageDto) throws ObjectNotFoundException {
        Damage updatedDamage = damageConverter.convertDamageDtoToDamage(damageDto);
        Damage damageResponse = damageService.updateDamageById(id, updatedDamage);
        return damageConverter.convertDamageToDamageDto(damageResponse);
    }

    @DeleteMapping("/damages/{id}")
    public void deleteDamageById(@PathVariable String id) throws ObjectNotFoundException {
        damageService.deleteDamageById(id);
    }
}
