package com.carflow.backend.infrastructure.boundaries.out.cars;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.domains.cars.interfaces.out.CarStorage;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CarStorageMemory implements CarStorage {

    private HashMap<String, Car> cars = new HashMap<String, Car>();
    private Integer nextId = 0;
    public CarStorageMemory() {
        createNewCar(new Car(nextId+1, "Peugeot", "308 CC", "D1 SMOK"));
    }

    @Override
    public Car createNewCar(Car car) {
        return cars.put((++nextId).toString(), new Car(nextId, car.getBrand(), car.getModel(), car.getRegistrationNumber()));
    }

    @Override
    public List<Car> getAllCars() {
        return cars.values().stream().toList();
    }

    @Override
    public Car getCarById(String id) {
        return cars.get(id);
    }

    @Override
    public Car updateCarById(String id, Car car) {
        if (cars.get(id) != null) {
            cars.remove(id);
        }
        return cars.put(id, car);
    }

    @Override
    public void deleteCarById(String id) {
        cars.remove(id);
    }
}
