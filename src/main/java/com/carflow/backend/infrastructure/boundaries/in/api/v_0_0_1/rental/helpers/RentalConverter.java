package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.rental.helpers;

import com.carflow.backend.domains.rental.models.Rental;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.rental.entities.RentalDto;
import org.springframework.stereotype.Service;

@Service
public class RentalConverter {
    public Rental convertRentalDtoToRental(RentalDto rentalDto) {
        return new Rental(
                rentalDto.getId(),
                rentalDto.getArchive(),
                rentalDto.getOrdersId(),
                rentalDto.getCarId(),
                rentalDto.getDeliveryAddress(),
                rentalDto.getDeliveryTime(),
                rentalDto.getScanOfTheContractUrl(),
                rentalDto.getScansOfTheRegulationsUrls(),
                rentalDto.getScanOfTheDeliveryProtocolUrl(),
                rentalDto.getDeliveryPhotosUrls(),
                rentalDto.getReturnAddress(),
                rentalDto.getReturnTime(),
                rentalDto.getReturnPhotosUrls(),
                rentalDto.getScanOfTheReturnProtocolUrl(),
                rentalDto.isDamagedVehicle(),
                rentalDto.getDamagedDescription(),
                rentalDto.getDamagedPhotosUrls()
        );
    }

    public RentalDto convertRentalToRentalDto(Rental rental) {
        return new RentalDto(
                rental.getId(),
                rental.getArchive(),
                rental.getOrdersId(),
                rental.getCarId(),
                rental.getDeliveryAddress(),
                rental.getDeliveryTime(),
                rental.getScanOfTheContractUrl(),
                rental.getScansOfTheRegulationsUrls(),
                rental.getScanOfTheDeliveryProtocolUrl(),
                rental.getDeliveryPhotosUrls(),
                rental.getReturnAddress(),
                rental.getReturnTime(),
                rental.getReturnPhotosUrls(),
                rental.getScanOfTheReturnProtocolUrl(),
                rental.isDamagedVehicle(),
                rental.getDamagedDescription(),
                rental.getDamagedPhotosUrls()
        );
    }
}
