package com.carflow.backend.infrastructure.boundaries.out.cars;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.domains.cars.interfaces.out.CarStorage;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CarStorageMemory implements CarStorage {

    private HashMap<String, Car> cars = new HashMap<String, Car>();
    private Integer nextId = 0;

    public CarStorageMemory() {
        createNewCar(new Car(-1, "Peugeot", "308 CC", 16524, "Pb95", 4, 3, "HATCHBACK", "D", "VF3WA5FWC34021008", "D1 SMOK", "19-05-2023", "19-05-2023", null, null));
        createNewCar(new Car(-1, "SKODA", "FABIA", 16524, "PB95", 4, 3, "COMBI", "B", "VF3WA5FWC34021008", "KR 4F514", "19-05-2023", "19-05-2023", null, null));
        createNewCar(new Car(-1, "SKODA", "OCTAVIA", 16524, "DIESEL", 4, 3, "COMBI", "D", "VF3WA5FWC34021008", "KR 5D74VB", "19-05-2023", "19-05-2023", null, null));
    }

    @Override
    public Car createNewCar(Car car) {
        String id = (++nextId).toString();
        cars.put(id, new Car(nextId, car.getBrand(), car.getModel(), car.getMileage(), car.getFuel(), car.getNumberOfSeats(), car.getNumberOfDoors(), car.getBodyType(), car.getSegment(), car.getVIN(), car.getRegistrationNumber(), car.getTechnicalExaminationDate(), car.getEndDateOfInsurance(), car.getDamagedDescription(), car.getDamagedPhotosUrls()));
        Car carResponse = cars.get(id);
        return carResponse;
    }

    @Override
    public List<Car> getAllCars() {
        return cars.values().stream().toList();
    }


    @Override
    public List<Car> getCarsWithParams(List<String> segments, List<String> bodyTypes) {
        List<Car> carResponse =  cars.values().stream().filter(
                car -> segments.contains(car.getSegment()) && bodyTypes.contains(car.getBodyType())
        ).toList();
        return carResponse;
    }

    @Override
    public Car getCarById(String id) {
        return cars.get(id);
    }

    @Override
    public Car updateCarById(String id, Car updatedCar) {
        cars.remove(id);
        return cars.put(id, updatedCar);
    }

    @Override
    public void deleteCarById(String id) {
        cars.remove(id);
    }
}
