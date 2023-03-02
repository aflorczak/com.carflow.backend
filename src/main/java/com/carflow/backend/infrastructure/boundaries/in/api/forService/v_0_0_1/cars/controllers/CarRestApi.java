package com.carflow.backend.infrastructure.boundaries.in.api.forService.v_0_0_1.cars.controllers;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.domains.cars.services.CarService;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import com.carflow.backend.infrastructure.boundaries.in.api.forService.v_0_0_1.cars.entities.CarDto;
import com.carflow.backend.infrastructure.boundaries.in.api.forService.v_0_0_1.cars.helpers.CarConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/for-service/v-0.0.1")
public class CarRestApi {
    private CarService carService;
    private CarConverter carConverter;

    @Autowired // required
    public CarRestApi(CarService carService, CarConverter carConverter) {
        this.carService = carService;
        this.carConverter = carConverter;
    }

    // tutaj sprawdzać poprawność przyjmowanych danych i ewentualnie rzucać błędem
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

    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable String id) throws ObjectNotFoundException {
        carService.deleteCarById(id);
    }
}
