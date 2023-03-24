package com.carflow.backend.modules.carModule.infrastructure.boundary.out.repository;

import com.carflow.backend.modules.carModule.infrastructure.boundary.out.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, String> {

}
