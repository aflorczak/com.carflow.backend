package com.carflow.backend.domains.cars.service;

import com.carflow.backend.domains.cars.entity.Car;
import com.carflow.backend.domains.cars.interfaces.out.CarStorage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private CarStorage storage;

    public CarService(CarStorage storage) {
        storage = storage;
    }

    public Car createNewCar(Car car) {
        return storage.createNewCar(car);
    }
    public List<Car> getAllCars() {
        return storage.getAllCars();
    }
    public Car getCarById(String id) {
        return storage.getCarById(id);
    }
    public Car updateCarById(String id, Car car) {
        return storage.updateCarById(id, car);
    }
    public void deleteCarById(String id) {
        storage.deleteCarById(id);
    }
}
