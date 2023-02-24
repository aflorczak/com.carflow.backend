package com.carflow.backend.infrastructure.boundaries.in.cars.controllers;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.domains.cars.services.CarService;
import com.carflow.backend.infrastructure.boundaries.in.cars.entities.CarDto;
import com.carflow.backend.infrastructure.boundaries.in.cars.helpers.CarConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarRestApi {
    private CarService carService;
    private CarConverter carConverter;

    @Autowired // required
    public CarRestApi(CarService carService, CarConverter carConverter) {
        this.carService = carService;
        this.carConverter = carConverter;
    }
    @PostMapping("/cars")
    public Car createNewCar(@RequestBody CarDto carRequest) {
        Car car = carService.createNewCar(carConverter.convertCarDtoToCar(carRequest));
        CarDto carResponse = carConverter.convertCarToCarDto(car);
        return car;
    }

    @GetMapping("/cars")
    public List<CarDto> getCars(
            @RequestParam(defaultValue = "B,C,D,SUV") String segments,
            @RequestParam(defaultValue = "SEDAN,HATCHBACK,COMBI,SUV") String bodyTypes
    ) {
        final List<String> segmentsList = Arrays.stream(segments.split(",")).toList();
        final List<String> bodyTypesList = Arrays.stream(bodyTypes.split(",")).toList();

        List<Car> cars = carService.getCarsWithParams(segmentsList, bodyTypesList);

        return cars.stream().map(car -> carConverter.convertCarToCarDto(car)).toList();
    }

    @GetMapping("/cars/{id}")
    public CarDto getCarById(@PathVariable String id) {
        Car car = carService.getCarById(id);
        if (!(car==null)) {
            return carConverter.convertCarToCarDto(car);
        } else {
            return null;
        }
    }

    @PutMapping("/cars/{id}")
    public CarDto updateCarById(@PathVariable String id, @RequestBody CarDto carDto) {
        Car updatedCar = carConverter.convertCarDtoToCar(carDto);
        Car carResponse = carService.updateCarById(id, updatedCar);

        if(!(carResponse == null)) {
            CarDto carDtoResponse = carConverter.convertCarToCarDto(carResponse);
            return carDtoResponse;
        } else {
            return null;
        }
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable String id) {
        carService.deleteCarById(id);
    }
}
