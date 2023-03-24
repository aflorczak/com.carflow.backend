package com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.repository;

import com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<RentalEntity, String> {
}
