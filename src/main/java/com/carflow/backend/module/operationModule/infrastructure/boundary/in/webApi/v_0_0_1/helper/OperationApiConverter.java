package com.carflow.backend.module.operationModule.infrastructure.boundary.in.webApi.v_0_0_1.helper;

import com.carflow.backend.module.operationModule.domain.model.Operation;
import com.carflow.backend.module.operationModule.infrastructure.boundary.in.webApi.v_0_0_1.model.OperationDto;
import org.springframework.stereotype.Service;

@Service
public class OperationApiConverter {
    public Operation convertOperationDtoToOperation(OperationDto operationDto) {
        Operation operation = new Operation();
        operation.setId(operationDto.getId());
        operation.setArchived(operationDto.getArchived());
        operation.setOperationTypes(operationDto.getOperationTypes());
        operation.setOperationAddressId(operationDto.getOperationAddressId());
        operation.setOperationDateTime(operationDto.getOperationDateTime());
        operation.setAttachmentsIds(operationDto.getAttachmentsIds());
        operation.setDamagesIds(operationDto.getDamagesIds());
        return operation;
    }

    public OperationDto convertOperationToOperationDto(Operation operation) {
        OperationDto operationDto = new OperationDto();
        operationDto.setId(operation.getId());
        operationDto.setArchived(operation.getArchived());
        operationDto.setOperationTypes(operation.getOperationTypes());
        operationDto.setOperationAddressId(operation.getOperationAddressId());
        operationDto.setOperationDateTime(operation.getOperationDateTime());
        operationDto.setAttachmentsIds(operation.getAttachmentsIds());
        operationDto.setDamagesIds(operation.getDamagesIds());
        return operationDto;
    }
}
