package com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.helper;

import com.carflow.backend.module.operationModule.domain.model.Operation;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
import org.springframework.stereotype.Service;

@Service
public class OperationConverter {
    public Operation convertOperationEntityToOperation(OperationEntity operationEntity) {
        Operation operation = new Operation();
        operation.setId(operationEntity.getId());
        operation.setOperationTypes(operationEntity.getOperationTypes());
        operation.setOperationDateTime(operationEntity.getOperationDateTime());
        operation.setOperationAddress(operationEntity.getOperationAddress());
        operation.setAttachments(operationEntity.getAttachments());
        operation.setDamages(operationEntity.getDamages());
        return operation;
    }

    public OperationEntity convertOperationToOperationEntity(Operation operation) {
        OperationEntity operationEntity = new OperationEntity();
        operationEntity.setId(operation.getId());
        operationEntity.setOperationTypes(operation.getOperationTypes());
        operationEntity.setOperationDateTime(operation.getOperationDateTime());
        operationEntity.setOperationAddress(operation.getOperationAddress());
        operationEntity.setAttachments(operation.getAttachments());
        operationEntity.setDamages(operation.getDamages());
        return operationEntity;
    }
}
