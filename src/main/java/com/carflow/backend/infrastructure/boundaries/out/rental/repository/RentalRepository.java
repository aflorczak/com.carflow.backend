package com.carflow.backend.infrastructure.boundaries.out.rental.repository;

import com.carflow.backend.infrastructure.boundaries.out.rental.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<RentalEntity, String> {
}
