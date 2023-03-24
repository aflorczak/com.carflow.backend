package com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.repository;

import com.carflow.backend.module.rentalModule.infrastructure.boundary.out.database.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<RentalEntity, String> {
}
