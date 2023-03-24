package com.carflow.backend.modules.carModule;

import com.carflow.backend.modules.carModule.customEnum.FuelType;
import com.carflow.backend.modules.carModule.infrastructure.boundary.out.entity.CarEntity;
import com.carflow.backend.modules.carModule.infrastructure.boundary.out.repository.CarRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

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

        firstCar.setBodyType("COMBI");
        secondCar.setBodyType("HATCHBACK");

        firstCar.setSegment("C");
        secondCar.setSegment("B");

        firstCar.setVIN("W0LPF8EC1B8084007");
        secondCar.setVIN("VF3CUHNZ6GY140436");


        firstCar.setRegistrationNumber("DKL 4F524");
        secondCar.setRegistrationNumber("DKL 5W24F");

        firstCar.setTechnicalExaminationDate("15-05-2023");
        secondCar.setTechnicalExaminationDate("15-05-2023");

        firstCar.setEndDateOfInsurance("15-05-2023");
        secondCar.setEndDateOfInsurance("15-05-2023");

        firstCar.setDamagedDescription(null);
        secondCar.setDamagedDescription(null);

        firstCar.setDamagedPhotosUrls(null);
        secondCar.setDamagedPhotosUrls(null);

        carRepository.save(firstCar);
        carRepository.save(secondCar);
    }
}
