package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.customEnum.OperationType;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.repository.OperationRepository;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.repository.PlaceRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OperationRunner implements ApplicationRunner {
    private final PlaceRepository placeRepository;
    private final OperationRepository operationRepository;

    public OperationRunner(PlaceRepository placeRepository, OperationRepository operationRepository) {
        // tutaj nie wolamy repo z innych modulow tylko ich serwisy
        this.placeRepository = placeRepository;
        this.operationRepository = operationRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        OperationEntity firstOutOperation = new OperationEntity();
        OperationEntity secondOutOperation = new OperationEntity();
        OperationEntity firstInOperation = new OperationEntity();
        firstOutOperation.setId(1);
        firstOutOperation.setOperationTypes(OperationType.DELIVERY_OPERATION);
        firstOutOperation.setOperationAddress(placeRepository.findById("1").get());
        firstOutOperation.setOperationDateTime(LocalDateTime.now());
        firstOutOperation.setAttachments(null);
        firstOutOperation.setDamages(null);

        secondOutOperation.setId(2);
        secondOutOperation.setOperationTypes(OperationType.DELIVERY_OPERATION);
        secondOutOperation.setOperationAddress(placeRepository.findById("2").get());
        secondOutOperation.setOperationDateTime(LocalDateTime.now());
        secondOutOperation.setAttachments(null);
        secondOutOperation.setDamages(null);

        firstInOperation.setId(3);
        firstInOperation.setOperationTypes(OperationType.RETURN_OPERATION);
        firstInOperation.setOperationAddress(placeRepository.findById("1").get());
        firstInOperation.setOperationDateTime(LocalDateTime.now().plusHours(2).plusDays(8));
        firstInOperation.setAttachments(null);
        firstInOperation.setDamages(null);

        operationRepository.save(firstOutOperation);
        operationRepository.save(secondOutOperation);
        operationRepository.save(firstInOperation);
    }
}
