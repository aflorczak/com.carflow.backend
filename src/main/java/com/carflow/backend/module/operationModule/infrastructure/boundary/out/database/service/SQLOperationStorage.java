package com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.operationModule.domain.intrerfaces.OperationStorage;
import com.carflow.backend.module.operationModule.domain.model.Operation;
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
        // skonczylem tutaj
        return null;
    }

    @Override
    public Operation getOperationById(String id) throws ObjectNotFoundException {
        return null;
    }

    @Override
    public Operation updateOperationById(String id, Operation updatedOperation) throws ObjectNotFoundException {
        return null;
    }

    @Override
    public void deleteOperationById(String id) throws ObjectNotFoundException {
        Optional<Operation> operation =
    }
}
