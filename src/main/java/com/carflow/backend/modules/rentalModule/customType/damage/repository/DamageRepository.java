package com.carflow.backend.modules.rentalModule.customType.damage.repository;

import com.carflow.backend.modules.rentalModule.customType.damage.entity.DamageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DamageRepository extends JpaRepository<DamageEntity, String> {
}
