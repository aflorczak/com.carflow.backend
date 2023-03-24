package com.carflow.backend.modules.rentalModule.customType.operation.repository;

import com.carflow.backend.modules.rentalModule.customType.operation.entity.OperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<OperationEntity, String> {
}
