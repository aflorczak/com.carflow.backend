package com.carflow.backend.module.carModule.domain.interfaces;

import com.carflow.backend.module.carModule.domain.model.Car;
import com.carflow.backend.exception.ObjectNotFoundException;

import java.util.List;

public interface CarStorage {
    Car createNewCar(Car car);
    List<Car> getAllCars();
    Car getCarById(String id) throws ObjectNotFoundException;
    Car updateCarById(String id, Car updatedCar) throws ObjectNotFoundException;
    void deleteCarById(String id) throws ObjectNotFoundException;
}
