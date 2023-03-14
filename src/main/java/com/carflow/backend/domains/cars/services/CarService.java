package com.carflow.backend.domains.cars.services;

import com.carflow.backend.domains.cars.models.Car;
import com.carflow.backend.domains.cars.interfaces.out.CarStorage;
import com.carflow.backend.exceptions.ObjectNotFoundException;
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

    public Car getCarById(String id) throws ObjectNotFoundException{
        return storage.getCarById(id);
    }

    public Car updateCarById(String id, Car updatedCar) throws ObjectNotFoundException{
        return storage.updateCarById(id, updatedCar);
    }
    public void deleteCarById(String id) throws ObjectNotFoundException {
        storage.deleteCarById(id);
    }

    public void moveToArchive(String id) throws ObjectNotFoundException {
        storage.moveToArchive(id);
    }
}
