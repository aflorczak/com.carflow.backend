package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.customEnum.OperationType;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.repository.OperationRepository;
import com.carflow.backend.module.placeModule.domain.service.PlaceService;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.repository.PlaceRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Order(2)
public class OperationRunner implements ApplicationRunner {
    private final PlaceRepository placeRepository;
    private final PlaceService placeService;
    private final OperationRepository operationRepository;

    public OperationRunner(PlaceRepository placeRepository,PlaceService placeService, OperationRepository operationRepository) {
        this.placeRepository = placeRepository;
        this.placeService = placeService;
        this.operationRepository = operationRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        OperationEntity firstOutOperation = new OperationEntity();
//        OperationEntity firstInOperation = new OperationEntity();
//
//        firstOutOperation.setId(1);
//        firstOutOperation.setOperationTypes(OperationType.DELIVERY_OPERATION);
//        firstOutOperation.setOperationAddressId(null);
//        firstOutOperation.setOperationDateTime(LocalDateTime.now());
//        firstOutOperation.setAttachmentsIds(null);
//        firstOutOperation.setDamagesIds(null);
//
//        firstInOperation.setId(2);
//        firstInOperation.setOperationTypes(OperationType.RETURN_OPERATION);
//        firstInOperation.setOperationAddressId(null);
//        firstInOperation.setOperationDateTime(LocalDateTime.now());
//        firstInOperation.setAttachmentsIds(null);
//        firstInOperation.setDamagesIds(null);
//
//        operationRepository.save(firstOutOperation);
//        operationRepository.save(firstInOperation);
    }
}
