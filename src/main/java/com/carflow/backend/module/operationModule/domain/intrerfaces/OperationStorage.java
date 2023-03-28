package com.carflow.backend.module.operationModule.domain.intrerfaces;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.damageModule.domain.model.Damage;
import com.carflow.backend.module.operationModule.domain.model.Operation;

import java.util.List;

public interface OperationStorage {
    Operation createNewOperation(Operation operation);
    List<Operation> getAllOperations();
    Operation getOperationById(String id) throws ObjectNotFoundException;
    Operation updateOperationById(String id, Operation updatedOperation) throws ObjectNotFoundException;
    void deleteOperationById(String id) throws ObjectNotFoundException;
}
