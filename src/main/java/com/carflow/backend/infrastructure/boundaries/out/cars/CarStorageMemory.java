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
        createNewCar(
                new Car(
                        nextId+1,
                        "Peugeot",
                        "308 CC",
                        16524,
                        "Pb95",
                        4,
                        3,
                        "Coupe Cabrio",
                        "VF3WA5FWC34021008",
                        "D1 SMOK",
                        "19-05-2023",
                        "19-05-2023"
                )
        );
    }

    @Override
    public Car createNewCar(Car car) {
        String id = (++nextId).toString();
        cars.put(
                id,
                new Car(
                        nextId,
                        car.getBrand(),
                        car.getModel(),
                        car.getMileage(),
                        car.getFuel(),
                        car.getNumberOfSeats(),
                        car.getNumberOfDoors(),
                        car.getBodyType(),
                        car.getVIN(),
                        car.getRegistrationNumber(),
                        car.getTechnicalExaminationDate(),
                        car.getEndDateOfInsurance()
                )
        );
        Car carResponse = cars.get(id);
        return carResponse;
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
    public void deleteCarById(String id) {
        cars.remove(id);
    }
}
