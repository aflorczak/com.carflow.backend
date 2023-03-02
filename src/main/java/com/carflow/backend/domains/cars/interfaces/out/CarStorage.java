package com.carflow.backend.domains.cars.interfaces.out;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.exceptions.ObjectNotFoundException;

import java.util.List;

public interface CarStorage {
    Car createNewCar(Car car);
    List<Car> getAllCars();
    List<Car> getCarsWithParams(List<String> segments, List<String> bodyTypes);
    Car getCarById(String id) throws ObjectNotFoundException;
    Car updateCarById(String id, Car updatedCar) throws ObjectNotFoundException;
    void deleteCarById(String id) throws ObjectNotFoundException;

}
