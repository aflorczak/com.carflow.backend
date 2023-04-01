package com.carflow.backend.module.operationModule.infrastructure.boundary.in.webApi.v_0_0_1.controller;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.operationModule.domain.model.Operation;
import com.carflow.backend.module.operationModule.domain.service.OperationService;
import com.carflow.backend.module.operationModule.infrastructure.boundary.in.webApi.v_0_0_1.helper.OperationApiConverter;
import com.carflow.backend.module.operationModule.infrastructure.boundary.in.webApi.v_0_0_1.model.OperationDto;
import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.helper.OperationConverter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1")
public class OperationRestApi {
    private final OperationService operationService;
    private final OperationApiConverter operationApiConverter;

    public OperationRestApi(OperationService operationService, OperationApiConverter operationApiConverter) {
        this.operationService = operationService;
        this.operationApiConverter = operationApiConverter;
    }

    @PostMapping("/operations")
    public OperationDto createNewOperation(@RequestBody OperationDto operationDto) {
        Operation operation = operationService.createNewOperation(operationApiConverter.convertOperationDtoToOperation(operationDto));
        return operationApiConverter.convertOperationToOperationDto(operation);
    }

    @GetMapping("/operations")
    public List<OperationDto> getAllOperations() {
        return operationService.getAllOperations().stream().map(operationApiConverter::convertOperationToOperationDto).toList();
    }

    @GetMapping("/operations/{id}")
    public OperationDto getOperationById(@PathVariable String id) throws ObjectNotFoundException {
        Operation operation = operationService.getOperationById(id);
        return operationApiConverter.convertOperationToOperationDto(operation);
    }

    @PutMapping("/operations/{id}")
    public OperationDto updateOperationById(@PathVariable String id, @RequestBody OperationDto operationDto) throws ObjectNotFoundException {
        Operation operation = operationApiConverter.convertOperationDtoToOperation(operationDto);
        Operation operationResponse = operationService.updateDamageById(id, operation);
        return operationApiConverter.convertOperationToOperationDto(operationResponse);
    }

    @DeleteMapping("/operations/{id}")
    public void deleteOperationById(@PathVariable String id) throws ObjectNotFoundException {
        operationService.deleteOperationById(id);
    }
}
