package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.cars.controllers;

import com.carflow.backend.domains.cars.models.Car;
import com.carflow.backend.domains.cars.services.CarService;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.cars.entities.CarDto;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.cars.helpers.CarConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1")
public class CarRestApi {
    private CarService carService;
    private CarConverter carConverter;

    @Autowired
    public CarRestApi(CarService carService, CarConverter carConverter) {
        this.carService = carService;
        this.carConverter = carConverter;
    }

    @PostMapping("/cars")
    public CarDto createNewCar(@RequestBody CarDto carRequest) {
        Car car = carService.createNewCar(carConverter.convertCarDtoToCar(carRequest));
        return carConverter.convertCarToCarDto(car);
    }

    @GetMapping("/cars")
    public List<CarDto> getAllCars() {
        return carService.getAllCars().stream().map(carConverter::convertCarToCarDto).toList();
    }

    @GetMapping("/cars/{id}")
    public CarDto getCarById(@PathVariable String id) throws ObjectNotFoundException {
        Car car = carService.getCarById(id);
        return carConverter.convertCarToCarDto(car);
    }

    @PutMapping("/cars/{id}")
    public CarDto updateCarById(@PathVariable String id, @RequestBody CarDto carDto) throws ObjectNotFoundException {
        Car updatedCar = carConverter.convertCarDtoToCar(carDto);
        Car carResponse = carService.updateCarById(id, updatedCar);
        return carConverter.convertCarToCarDto(carResponse);
    }

    @PatchMapping("/cars/{id}/archive")
    public void moveToArchive(@PathVariable String id) throws ObjectNotFoundException {
        carService.moveToArchive(id);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable String id) throws ObjectNotFoundException {
        carService.deleteCarById(id);
    }
}
