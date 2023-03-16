package com.carflow.backend.infrastructure.boundaries.out.operation.repository;

import com.carflow.backend.infrastructure.boundaries.out.operation.entity.OperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<OperationEntity, String> {
}
