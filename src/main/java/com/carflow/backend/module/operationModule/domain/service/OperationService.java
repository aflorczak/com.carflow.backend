package com.carflow.backend.module.operationModule.domain.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.operationModule.domain.intrerfaces.OperationStorage;
import com.carflow.backend.module.operationModule.domain.model.Operation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationService {
    private final OperationStorage storage;

    public OperationService(OperationStorage storage) {
        this.storage = storage;
    }

    public Operation createNewOperation(Operation operation) {
        return storage.createNewOperation(operation);
    }

    public List<Operation> getAllOperations() {
        return storage.getAllOperations();
    }

    public Operation getOperationById(String id) throws ObjectNotFoundException {
        return storage.getOperationById(id);
    }

    public Operation updateDamageById(String id, Operation operation) throws ObjectNotFoundException {
        return storage.updateOperationById(id, operation);
    }

    public void deleteOperationById(String id) throws ObjectNotFoundException {
        storage.deleteOperationById(id);
    }
}
