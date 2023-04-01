package com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.helper;

import com.carflow.backend.module.operationModule.domain.model.Operation;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
import org.springframework.stereotype.Service;

@Service
public class OperationConverter {
    public Operation convertOperationEntityToOperation(OperationEntity operationEntity) {
        Operation operation = new Operation();
        operation.setId(operationEntity.getId());
        operation.setArchived(operationEntity.getArchived());
        operation.setOperationTypes(operationEntity.getOperationTypes());
        operation.setOperationDateTime(operationEntity.getOperationDateTime());
        operation.setOperationAddressId(operationEntity.getOperationAddressId());
        operation.setAttachmentsIds(operationEntity.getAttachmentsIds());
        operation.setDamagesIds(operationEntity.getDamagesIds());
        return operation;
    }

    public OperationEntity convertOperationToOperationEntity(Operation operation) {
        OperationEntity operationEntity = new OperationEntity();
        operationEntity.setId(operation.getId());
        operationEntity.setArchived(operation.getArchived());
        operationEntity.setOperationTypes(operation.getOperationTypes());
        operationEntity.setOperationDateTime(operation.getOperationDateTime());
        operationEntity.setOperationAddressId(operation.getOperationAddressId());
        operationEntity.setAttachmentsIds(operation.getAttachmentsIds());
        operationEntity.setDamagesIds(operation.getDamagesIds());
        return operationEntity;
    }
}
