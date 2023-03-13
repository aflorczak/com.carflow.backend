package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.cars.helpers;

import com.carflow.backend.domains.cars.models.Car;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.cars.entities.CarDto;
import org.springframework.stereotype.Service;

@Service
public class CarConverter {
    public Car convertCarDtoToCar(CarDto carDto) {
        return new Car(
                carDto.getId(),
                carDto.getArchive(),
                carDto.getBranchSlug(),
                carDto.getBrand(),
                carDto.getModel(),
                carDto.getMileage(),
                carDto.getFuel(),
                carDto.getNumberOfSeats(),
                carDto.getNumberOfDoors(),
                carDto.getBodyType(),
                carDto.getSegment(),
                carDto.getVIN(),
                carDto.getRegistrationNumber(),
                carDto.getTechnicalExaminationDate(),
                carDto.getEndDateOfInsurance(),
                carDto.getDamagedDescription(),
                carDto.getDamagedPhotosUrls()
        );
    }

    public CarDto convertCarToCarDto(Car car) {
        return new CarDto(
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
}
