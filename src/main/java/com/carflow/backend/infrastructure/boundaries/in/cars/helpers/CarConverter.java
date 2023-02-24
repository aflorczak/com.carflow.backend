package com.carflow.backend.infrastructure.boundaries.in.cars.helpers;

import com.carflow.backend.domains.cars.entities.Car;
import com.carflow.backend.infrastructure.boundaries.in.cars.entities.CarDto;
import org.springframework.stereotype.Service;

@Service
public class CarConverter {
    public Car convertCarDtoToCar(CarDto carDto) {
        return new Car(
                carDto.getId(),
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
                carDto.getEndDateOfInsurance()
        );
    }

    public CarDto convertCarToCarDto(Car car) {
        return new CarDto(
                car.getId(),
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
                car.getEndDateOfInsurance()
        );
    }
}
