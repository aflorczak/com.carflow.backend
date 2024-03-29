package com.carflow.backend.module.carModule.infrastructure.boundary.out.database.helper;

import com.carflow.backend.module.carModule.domain.model.Car;
import com.carflow.backend.module.carModule.infrastructure.boundary.out.database.entity.CarEntity;
import org.springframework.stereotype.Service;

@Service
public class CarEntityConverter {
    public CarEntity convertCarToCarEntity(Car car) {
        return new CarEntity(
                car.getId(),
                car.getArchive(),
                car.getBranchSlug(),
                car.getBrand(),
                car.getModel(),
                car.getMileage(),
                car.getFuel(),
                car.getNumberOfSeats(),
                car.getNumberOfDoors(),
                car.getBodyType(),
                car.getSegment(),
                car.getVIN(),
                car.getRegistrationNumber(),
                car.getTechnicalExaminationDate(),
                car.getEndDateOfInsurance(),
                car.getDamagedDescription(),
                car.getDamagedPhotosUrls()
        );
    }

    public Car convertCarEntityToCar(CarEntity carEntity) {
        return new Car(
                carEntity.getId(),
                carEntity.getArchive(),
                carEntity.getBranchSlug(),
                carEntity.getBrand(),
                carEntity.getModel(),
                carEntity.getMileage(),
                carEntity.getFuel(),
                carEntity.getNumberOfSeats(),
                carEntity.getNumberOfDoors(),
                carEntity.getBodyType(),
                carEntity.getSegment(),
                carEntity.getVIN(),
                carEntity.getRegistrationNumber(),
                carEntity.getTechnicalExaminationDate(),
                carEntity.getEndDateOfInsurance(),
                carEntity.getDamagedDescription(),
                carEntity.getDamagedPhotosUrls()
        );
    }
}
