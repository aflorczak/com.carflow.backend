package com.carflow.backend.domains.cars.interfaces.out;

import com.carflow.backend.domains.cars.entities.Car;

import java.util.List;

public interface CarStorage {
    Car createNewCar(Car car);
    List<Car> getAllCars();
    List<Car> getCarsWithParams(List<String> segments, List<String> bodyTypes);
    Car getCarById(String id);
    Car updateCarById(String id, Car updatedCar);
    void deleteCarById(String id);

}
