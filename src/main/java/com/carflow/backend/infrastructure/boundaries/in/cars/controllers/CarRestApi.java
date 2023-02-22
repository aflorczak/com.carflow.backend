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
    public Car createNewCar(@RequestBody CarDto carRequest) {
        Car car = carService.createNewCar(
                new Car(
                        carRequest.getId(),
                        carRequest.getBrand(),
                        carRequest.getModel(),
                        carRequest.getMileage(),
                        carRequest.getFuel(),
                        carRequest.getNumberOfSeats(),
                        carRequest.getNumberOfDoors(),
                        carRequest.getBodyType(),
                        carRequest.getVIN(),
                        carRequest.getRegistrationNumber(),
                        carRequest.getTechnicalExaminationDate(),
                        carRequest.getEndDateOfInsurance()
                )
        );
        CarDto carResponse = new CarDto(
                car.getId(),
                car.getBrand(),
                car.getModel(),
                car.getMileage(),
                car.getFuel(),
                car.getNumberOfSeats(),
                car.getNumberOfDoors(),
                car.getBodyType(),
                car.getVIN(),
                car.getRegistrationNumber(),
                car.getTechnicalExaminationDate(),
                car.getEndDateOfInsurance()
        );
        return car;
    }

    @GetMapping("/cars")
    public List<CarDto> getAllCars() {
        List<Car> cars = carService.getAllCars();

        List<CarDto> carsResponse = cars.stream().map(car -> new CarDto(
                car.getId(),
                car.getBrand(),
                car.getModel(),
                car.getMileage(),
                car.getFuel(),
                car.getNumberOfSeats(),
                car.getNumberOfDoors(),
                car.getBodyType(),
                car.getVIN(),
                car.getRegistrationNumber(),
                car.getTechnicalExaminationDate(),
                car.getEndDateOfInsurance()
                )
        ).toList();

        return carsResponse;
    }

    @GetMapping("/cars/{id}")
    public CarDto getCarById(@PathVariable String id) {
        Car car = carService.getCarById(id);
        if (!(car==null)) {
            return new CarDto(
                    car.getId(),
                    car.getBrand(),
                    car.getModel(),
                    car.getMileage(),
                    car.getFuel(),
                    car.getNumberOfSeats(),
                    car.getNumberOfDoors(),
                    car.getBodyType(),
                    car.getVIN(),
                    car.getRegistrationNumber(),
                    car.getTechnicalExaminationDate(),
                    car.getEndDateOfInsurance()
            );
        } else {
            return null;
        }

    }

    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable String id) {
        carService.deleteCarById(id);
    }
}
