package com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.repository;

import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.entity.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<PlaceEntity, String> {
}
