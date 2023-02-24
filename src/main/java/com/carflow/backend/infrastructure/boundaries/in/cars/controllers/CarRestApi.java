package com.carflow.backend.infrastructure.boundaries.in.cars.controllers;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.domains.cars.services.CarService;
import com.carflow.backend.infrastructure.boundaries.in.cars.entities.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SimpleTimeZone;

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
                        carRequest.getSegment(),
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
                car.getSegment(),
                car.getVIN(),
                car.getRegistrationNumber(),
                car.getTechnicalExaminationDate(),
                car.getEndDateOfInsurance()
        );
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

        return cars.stream().map(car -> new CarDto(
                car.getId(),
                car.getBrand(),
                car.getModel(),
                car.getMileage(),
                car.getFuel(),
                car.getNumberOfSeats(),
                car.getNumberOfDoors(),
                car.getBodyType(),
                car.getSegment(),
                car.getVIN(),
                car.getRegistrationNumber(),
                car.getTechnicalExaminationDate(),
                car.getEndDateOfInsurance()
                )
        ).toList();
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
                    car.getSegment(),
                    car.getVIN(),
                    car.getRegistrationNumber(),
                    car.getTechnicalExaminationDate(),
                    car.getEndDateOfInsurance()
            );
        } else {
            return null;
        }

    }

    @PutMapping("/cars/{id}")
    public CarDto updateCarById(@PathVariable String id, @RequestBody CarDto carDto) {
        Car updatedCar = new Car(
                carDto.getId(),
                carDto.getBrand(),
                carDto.getModel(),
                carDto.getMileage(),
                carDto.getFuel(),
                carDto.getNumberOfSeats(),
                carDto.getNumberOfDoors(),
                carDto.getBodyType(),
                carDto.getSegment(),
                carDto.getVIN(),
                carDto.getRegistrationNumber(),
                carDto.getTechnicalExaminationDate(),
                carDto.getEndDateOfInsurance()
        );
        Car carResponse = carService.updateCarById(id, updatedCar);

        CarDto carDtoResponse = new CarDto(
                carResponse.getId(),
                carDto.getBrand(),
                carDto.getModel(),
                carDto.getMileage(),
                carDto.getFuel(),
                carDto.getNumberOfSeats(),
                carDto.getNumberOfDoors(),
                carDto.getBodyType(),
                carDto.getSegment(),
                carDto.getVIN(),
                carDto.getRegistrationNumber(),
                carDto.getTechnicalExaminationDate(),
                carDto.getEndDateOfInsurance()
        );
        return carDtoResponse;
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCarById(@PathVariable String id) {
        carService.deleteCarById(id);
    }
}
