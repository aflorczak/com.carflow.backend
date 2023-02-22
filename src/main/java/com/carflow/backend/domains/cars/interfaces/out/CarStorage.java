package com.carflow.backend.domains.cars.interfaces.out;

import com.carflow.backend.domains.cars.entities.Car;

import java.util.List;

public interface CarStorage {
    Car createNewCar(Car car);
    List<Car> getAllCars();
    Car getCarById(String id);
    void deleteCarById(String id);
}
