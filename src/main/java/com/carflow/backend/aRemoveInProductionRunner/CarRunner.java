package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.customEnum.BodyType;
import com.carflow.backend.customEnum.CarSegment;
import com.carflow.backend.customEnum.FuelType;
import com.carflow.backend.module.carModule.infrastructure.boundary.out.database.entity.CarEntity;
import com.carflow.backend.module.carModule.infrastructure.boundary.out.database.repository.CarRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CarRunner implements ApplicationRunner {
    private final CarRepository carRepository;

    public CarRunner(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        CarEntity firstCar = new CarEntity();
//
//        firstCar.setId(1);
//
//        firstCar.setArchive(false);
//
//        firstCar.setBranchSlug("wroclaw-lotnisko");
//
//        firstCar.setBrand("Skoda");
//
//        firstCar.setModel("Fabia");
//
//
//        firstCar.setMileage(514);
//
//        firstCar.setFuel(FuelType.PB95);
//
//        firstCar.setNumberOfSeats(5);
//
//        firstCar.setNumberOfDoors(5);
//
//        firstCar.setBodyType(BodyType.COMBI);
//
//        firstCar.setSegment(CarSegment.B);
//
//        firstCar.setVIN("W0LPF8EC1B8084007");
//
//
//        firstCar.setRegistrationNumber("DKL 4F524");
//
//        firstCar.setTechnicalExaminationDate(LocalDate.of(2026,03,24));
//
//        firstCar.setEndDateOfInsurance(LocalDate.of(2024,03,24));
//
//        firstCar.setDamagedDescription(null);
//
//        firstCar.setDamagedPhotosUrls(null);
//
//        carRepository.save(firstCar);
    }
}
