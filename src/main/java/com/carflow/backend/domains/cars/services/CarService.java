package com.carflow.backend.domains.cars.services;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.domains.cars.interfaces.out.CarStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private CarStorage storage;

    @Autowired
    public CarService(CarStorage storage) {
        this.storage = storage;
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
    public void deleteCarById(String id) {
        storage.deleteCarById(id);
    }
}
