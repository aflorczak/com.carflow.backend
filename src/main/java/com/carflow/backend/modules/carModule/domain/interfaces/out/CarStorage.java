package com.carflow.backend.modules.carModule.domain.interfaces.out;

import com.carflow.backend.modules.carModule.domain.models.Car;
import com.carflow.backend.exception.ObjectNotFoundException;

import java.util.List;

public interface CarStorage {
    Car createNewCar(Car car);
    List<Car> getAllCars();
    Car getCarById(String id) throws ObjectNotFoundException;
    Car updateCarById(String id, Car updatedCar) throws ObjectNotFoundException;
    Car moveToArchive(String id) throws ObjectNotFoundException;
    void deleteCarById(String id) throws ObjectNotFoundException;

}
