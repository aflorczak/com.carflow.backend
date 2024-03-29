package com.carflow.backend.module.carModule.infrastructure.boundary.in.webApi.v_0_0_1.controllers;

import com.carflow.backend.module.carModule.domain.model.Car;
import com.carflow.backend.module.carModule.domain.service.CarService;
import com.carflow.backend.module.carModule.infrastructure.boundary.in.webApi.v_0_0_1.entities.CarDto;
import com.carflow.backend.module.carModule.infrastructure.boundary.in.webApi.v_0_0_1.helpers.CarConverter;
import com.carflow.backend.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1/cars")
public class CarRestApi {
    private final CarService carService;
    private final CarConverter carConverter;

    @Autowired
    public CarRestApi(CarService carService, CarConverter carConverter) {
        this.carService = carService;
        this.carConverter = carConverter;
    }

    @PostMapping()
    public CarDto createNewCar(@RequestBody CarDto carRequest) {
        Car car = carService.createNewCar(carConverter.convertCarDtoToCar(carRequest));
        return carConverter.convertCarToCarDto(car);
    }

    @GetMapping()
    public List<CarDto> getAllCars() {
        return carService.getAllCars().stream().map(carConverter::convertCarToCarDto).toList();
    }

    @GetMapping("/{id}")
    public CarDto getCarById(@PathVariable String id) throws ObjectNotFoundException {
        Car car = carService.getCarById(id);
        return carConverter.convertCarToCarDto(car);
    }

    @PutMapping("/{id}")
    public CarDto updateCarById(@PathVariable String id, @RequestBody CarDto carDto) throws ObjectNotFoundException {
        Car updatedCar = carConverter.convertCarDtoToCar(carDto);
        Car carResponse = carService.updateCarById(id, updatedCar);
        return carConverter.convertCarToCarDto(carResponse);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable String id) throws ObjectNotFoundException {
        carService.deleteCarById(id);
    }
}
