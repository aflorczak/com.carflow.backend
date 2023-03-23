package com.carflow.backend.infrastructure.boundaries.out.place.repository;

import com.carflow.backend.infrastructure.boundaries.out.place.entity.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<PlaceEntity, String> {
}
