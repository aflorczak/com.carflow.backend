package com.carflow.backend.modules.carModule.infrastructure.boundary.out.implementations;

import com.carflow.backend.modules.carModule.domain.interfaces.out.CarStorage;
import com.carflow.backend.modules.carModule.domain.models.Car;
import com.carflow.backend.modules.carModule.infrastructure.boundary.out.entity.CarEntity;
import com.carflow.backend.modules.carModule.infrastructure.boundary.out.helpers.CarEntityConverter;
import com.carflow.backend.modules.carModule.infrastructure.boundary.out.repository.CarRepository;
import com.carflow.backend.exception.ObjectNotFoundException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Profile("sqlStorage")
public class SQLCarStorage implements CarStorage {

    final private CarRepository carRepository;
    final private CarEntityConverter carEntityConverter;

    public SQLCarStorage(CarRepository carRepository, CarEntityConverter carEntityConverter) {
        this.carRepository = carRepository;
        this.carEntityConverter = carEntityConverter;
    }
    @Override
    public Car createNewCar(Car car) {
        CarEntity carEntity = carRepository.save(carEntityConverter.convertCarToCarEntity(car));
        return carEntityConverter.convertCarEntityToCar(carEntity);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll().stream().map(carEntityConverter::convertCarEntityToCar).toList();
    }

    @Override
    public Car getCarById(String id) throws ObjectNotFoundException {
        Optional<CarEntity> car = carRepository.findById(id);
        if (car.isPresent()) {
            return carEntityConverter.convertCarEntityToCar(car.get());
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }

    @Override
    public Car updateCarById(String id, Car updatedCar) throws ObjectNotFoundException {
        CarEntity carEntity = carRepository.save(carEntityConverter.convertCarToCarEntity(updatedCar));
        return carEntityConverter.convertCarEntityToCar(carEntity);
    }

    @Override
    public Car moveToArchive(String id) throws ObjectNotFoundException {
        Optional<CarEntity> car = carRepository.findById(id);
        if (car.isPresent()) {
            CarEntity updatedCar = car.get();
            updatedCar.setArchive(true);
            return carEntityConverter.convertCarEntityToCar(carRepository.save(updatedCar));
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }

    @Override
    public void deleteCarById(String id) throws ObjectNotFoundException {
        Optional<CarEntity> car = carRepository.findById(id);
        if (car.isPresent()) {
            carRepository.deleteById(id);
        } else {
            throw new ObjectNotFoundException("Object not found");
        }

    }
}
