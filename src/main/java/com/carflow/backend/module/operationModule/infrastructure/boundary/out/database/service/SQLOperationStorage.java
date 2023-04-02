package com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.operationModule.domain.intrerfaces.OperationStorage;
import com.carflow.backend.module.operationModule.domain.model.Operation;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.helper.OperationConverter;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.repository.OperationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SQLOperationStorage implements OperationStorage {
    private final OperationRepository operationRepository;
    private final OperationConverter converter;

    public SQLOperationStorage(
            OperationRepository operationRepository,
            OperationConverter converter
    ) {
        this.operationRepository = operationRepository;
        this.converter = converter;
    }

    @Override
    public Operation createNewOperation(Operation operation) {
        return converter.convertOperationEntityToOperation(operationRepository.save(converter.convertOperationToOperationEntity(operation)));
    }

    @Override
    public List<Operation> getAllOperations() {
        List<OperationEntity> operationEntities = operationRepository.findAll();
        return operationEntities.stream().map(converter::convertOperationEntityToOperation).toList();
    }

    @Override
    public Operation getOperationById(String id) throws ObjectNotFoundException {
        Optional<OperationEntity> operationEntity = operationRepository.findById(id);
        if (operationEntity.isPresent()) {
            return converter.convertOperationEntityToOperation(operationEntity.get());
        } else {
            throw new ObjectNotFoundException("Object not found.");
        }
    }

    @Override
    public Operation updateOperationById(String id, Operation updatedOperation) throws ObjectNotFoundException {
        if (operationRepository.existsById(id)) {
            OperationEntity operationEntity = operationRepository.save(converter.convertOperationToOperationEntity(updatedOperation));
            return converter.convertOperationEntityToOperation(operationEntity);
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }

    @Override
    public void deleteOperationById(String id) throws ObjectNotFoundException {
        Optional<OperationEntity> operation = operationRepository.findById(id);
        if (operation.isPresent()) {
            operationRepository.deleteById(id);
        } else {
            throw new ObjectNotFoundException("Object not found.");
        }
    }
}
