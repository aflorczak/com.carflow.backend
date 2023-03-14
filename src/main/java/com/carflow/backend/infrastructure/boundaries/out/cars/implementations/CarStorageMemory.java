package com.carflow.backend.infrastructure.boundaries.out.cars.implementations;

import com.carflow.backend.domains.cars.models.Car;
import com.carflow.backend.domains.cars.interfaces.out.CarStorage;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Profile("mememoryStorage")
public class CarStorageMemory implements CarStorage {

    private HashMap<String, Car> cars = new HashMap<String, Car>();
    private Integer nextId = 0;

    public CarStorageMemory() {
        createNewCar(new Car(-1, false, "wroclaw-lotnisko","Peugeot", "308 CC", 16524, "Pb95", 4, 3, "HATCHBACK", "D", "VF3WA5FWC34021008", "D1 SMOK", "19-05-2023", "19-05-2023", null, null));
        createNewCar(new Car(-1, false, "Wroclaw-lotnisko", "SKODA", "FABIA", 16524, "PB95", 4, 3, "COMBI", "B", "VF3WA5FWC34021008", "KR 4F514", "19-05-2023", "19-05-2023", null, null));
        createNewCar(new Car(-1, false, "wroclaw-lotnisko", "SKODA", "OCTAVIA", 16524, "DIESEL", 4, 3, "COMBI", "D", "VF3WA5FWC34021008", "KR 5D74VB", "19-05-2023", "19-05-2023", null, null));
    }


    @Override
    public Car createNewCar(Car car) {
        String id = (++nextId).toString();
        cars.put(id, new Car(nextId, car.getArchive(), car.getBranchSlug(), car.getBrand(), car.getModel(), car.getMileage(), car.getFuel(), car.getNumberOfSeats(), car.getNumberOfDoors(), car.getBodyType(), car.getSegment(), car.getVIN(), car.getRegistrationNumber(), car.getTechnicalExaminationDate(), car.getEndDateOfInsurance(), car.getDamagedDescription(), car.getDamagedPhotosUrls()));
        Car carResponse = cars.get(id);
        return carResponse;
    }

    @Override
    public List<Car> getAllCars() {
        return cars.values().stream().toList();
    }

    @Override
    public Car getCarById(String id) throws ObjectNotFoundException {
        if (cars.containsKey(id)) {
            return cars.get(id);
        } else {
            throw new ObjectNotFoundException("The vehicle with the given ID does not exist in the database.");
        }
    }

    @Override
    public Car updateCarById(String id, Car updatedCar) throws ObjectNotFoundException{
        if (cars.containsKey(id)) {
            cars.remove(id);
            return cars.put(id, updatedCar);
        } else {
            throw new ObjectNotFoundException("The vehicle with the given ID does not exist in the database.");
        }
    }

    @Override
    public Car moveToArchive(String id) throws ObjectNotFoundException {
        if (cars.containsKey(id)) {
            Car car = cars.get(id);
            car.setArchive(true);
            return car;
        } else {
            throw new ObjectNotFoundException("The vehicle with the given ID does not exist in the database.");
        }
    }

    @Override
    public void deleteCarById(String id) throws ObjectNotFoundException {
        if (cars.containsKey(id)) {
            cars.remove(id);
        } else {
            throw new ObjectNotFoundException("The vehicle with the given ID does not exist in the database.");
        }
    }
}
