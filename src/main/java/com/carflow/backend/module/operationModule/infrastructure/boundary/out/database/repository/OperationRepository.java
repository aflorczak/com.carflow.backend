package com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.repository;

import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<OperationEntity, String> {
}
