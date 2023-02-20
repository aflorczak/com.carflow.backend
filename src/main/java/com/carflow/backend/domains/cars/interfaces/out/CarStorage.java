package com.carflow.backend.domains.cars.interfaces.out;

import com.carflow.backend.domains.cars.entity.Car;

import java.util.List;

public interface CarStorage {
    Car createNewCar(Car car);
    List<Car> getAllCars();
    Car getCarById(String id);
    Car updateCarById(String id, Car car);
    void deleteCarById(String id);
}
