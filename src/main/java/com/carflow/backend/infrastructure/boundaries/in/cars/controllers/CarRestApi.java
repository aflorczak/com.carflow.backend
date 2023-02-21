package com.carflow.backend.infrastructure.boundaries.in.cars.controllers;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.domains.cars.services.CarService;
import com.carflow.backend.infrastructure.boundaries.in.cars.entities.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarRestApi {
    private CarService carService;

    @Autowired // required
    public CarRestApi(CarService carService) {
        this.carService = carService;
    }
    @PostMapping("/cars")
    public CarDto createNewCar(@RequestBody CarDto carRequest) {
        Car car = carService.createNewCar(new Car(carRequest.getId(), carRequest.getBrand(), carRequest.getModel(), carRequest.getRegistrationNumber())); // convert to CarDto
        CarDto carResponse = new CarDto(car.getId(), car.getBrand(), car.getModel(), car.getRegistrationNumber());
        return carResponse;
    }

    @GetMapping("/cars")
    public List<CarDto> getAllCars() {
        List<Car> cars = carService.getAllCars();

        List<CarDto> carsResponse = cars.stream().map(car -> new CarDto(car.getId(), car.getBrand(), car.getModel(), car.getRegistrationNumber())).toList();

        return carsResponse;
    }

    @GetMapping("/cars/{id}")
    public CarDto getCarById(@PathVariable String id) {
        Car car = carService.getCarById(id);
        if (!(car==null)) {
            return new CarDto(car.getId(), car.getBrand(), car.getModel(), car.getRegistrationNumber());
        } else {
            return null;
        }

    }

    // not working
    @PutMapping("/cars/{id}")
    public Car updateCarById(@PathVariable String id, @RequestBody Car car) {
        return carService.updateCarById(id, car);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable String id) {
        carService.deleteCarById(id);
    }
}
