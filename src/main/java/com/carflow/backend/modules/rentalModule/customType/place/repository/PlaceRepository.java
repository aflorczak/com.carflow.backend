package com.carflow.backend.modules.rentalModule.customType.place.repository;

import com.carflow.backend.modules.rentalModule.customType.place.entity.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<PlaceEntity, String> {
}
