package com.carflow.backend.domains.cars.interfaces.out;

import com.carflow.backend.domains.cars.models.Car;
import com.carflow.backend.exceptions.ObjectNotFoundException;

import java.util.List;

public interface CarStorage {
    Car createNewCar(Car car);
    List<Car> getAllCars();
    List<Car> getCarsWithParams(List<String> segments, List<String> bodyTypes);
    List<Car> getCarsByBranchSlug(String branchSlug);
    Car getCarById(String id) throws ObjectNotFoundException;
    Car updateCarById(String id, Car updatedCar) throws ObjectNotFoundException;
    void deleteCarById(String id) throws ObjectNotFoundException;

}
