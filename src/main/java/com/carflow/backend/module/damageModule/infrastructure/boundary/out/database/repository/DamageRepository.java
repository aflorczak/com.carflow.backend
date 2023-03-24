package com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.repository;

import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.entity.DamageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DamageRepository extends JpaRepository<DamageEntity, String> {
}
