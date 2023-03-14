package com.carflow.backend.infrastructure.boundaries.out.cars.repository;

import com.carflow.backend.infrastructure.boundaries.out.cars.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, String> {

}
