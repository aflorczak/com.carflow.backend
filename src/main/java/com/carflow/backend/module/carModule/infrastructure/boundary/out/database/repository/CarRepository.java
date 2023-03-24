package com.carflow.backend.module.carModule.infrastructure.boundary.out.database.repository;

import com.carflow.backend.module.carModule.infrastructure.boundary.out.database.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, String> {

}
