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
        CarEntity firstCar = new CarEntity();
        CarEntity secondCar = new CarEntity();

        firstCar.setId(1);
        secondCar.setId(2);

        firstCar.setArchive(false);
        secondCar.setArchive(false);

        firstCar.setBranchSlug("wroclaw-lotnisko");
        secondCar.setBranchSlug("gdansk-lotnisko");

        firstCar.setBrand("Opel");
        secondCar.setBrand("Paugeot");

        firstCar.setModel("Astra");
        secondCar.setModel("206");


        firstCar.setMileage(514);
        secondCar.setMileage(54);

        firstCar.setFuel(FuelType.DIESEL);
        secondCar.setFuel(FuelType.ELECTRIC);

        firstCar.setNumberOfSeats(5);
        secondCar.setNumberOfSeats(4);

        firstCar.setNumberOfDoors(5);
        secondCar.setNumberOfDoors(3);

        firstCar.setBodyType(BodyType.COMBI);
        secondCar.setBodyType(BodyType.SEDAN);

        firstCar.setSegment(CarSegment.C);
        secondCar.setSegment(CarSegment.B);

        firstCar.setVIN("W0LPF8EC1B8084007");
        secondCar.setVIN("VF3CUHNZ6GY140436");


        firstCar.setRegistrationNumber("DKL 4F524");
        secondCar.setRegistrationNumber("DKL 5W24F");

        firstCar.setTechnicalExaminationDate(LocalDate.of(2026,03,24));
        secondCar.setTechnicalExaminationDate(LocalDate.of(2026,03,24));

        firstCar.setEndDateOfInsurance(LocalDate.of(2024,03,24));
        secondCar.setEndDateOfInsurance(LocalDate.of(2024,03,24));

        firstCar.setDamagedDescription(null);
        secondCar.setDamagedDescription(null);

        firstCar.setDamagedPhotosUrls(null);
        secondCar.setDamagedPhotosUrls(null);

        carRepository.save(firstCar);
        carRepository.save(secondCar);
    }
}
