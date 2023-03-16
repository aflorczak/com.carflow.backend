package com.carflow.backend.infrastructure.boundaries.out.damage.repository;

import com.carflow.backend.infrastructure.boundaries.out.damage.entity.DamageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DamageRepository extends JpaRepository<DamageEntity, String> {
}
