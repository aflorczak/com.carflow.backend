package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.rental.helpers;

import com.carflow.backend.domains.rental.models.Rental;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.rental.models.RentalDto;
import org.springframework.stereotype.Service;

@Service
public class RentalConverter {
    public Rental convertRentalDtoToRental(RentalDto rentalDto) {
        return new Rental(
                rentalDto.getId(),
                rentalDto.getArchive(),
                rentalDto.getOrderId(),
                rentalDto.getCarId(),
                rentalDto.getActualDeliveryAddress(),
                rentalDto.getActualReturnDate(),
                rentalDto.getActualDeliveryTime(),
                rentalDto.getScanOfTheContractUrl(),
                rentalDto.getScansOfTheRegulationsUrls(),
                rentalDto.getScanOfTheDeliveryProtocolUrl(),
                rentalDto.getDeliveryPhotosUrls(),
                rentalDto.getActualReturnAddress(),
                rentalDto.getActualReturnDate(),
                rentalDto.getActualReturnTime(),
                rentalDto.getReturnPhotosUrls(),
                rentalDto.getScanOfTheReturnProtocolUrl(),
                rentalDto.getDamageIds()
        );
    }

    public RentalDto convertRentalToRentalDto(Rental rental) {
        return new RentalDto(
                rental.getId(),
                rental.getArchive(),
                rental.getOrderId(),
                rental.getCarId(),
                rental.getActualDeliveryAddress(),
                rental.getActualReturnDate(),
                rental.getActualDeliveryTime(),
                rental.getScanOfTheContractUrl(),
                rental.getScansOfTheRegulationsUrls(),
                rental.getScanOfTheDeliveryProtocolUrl(),
                rental.getDeliveryPhotosUrls(),
                rental.getActualReturnAddress(),
                rental.getActualReturnDate(),
                rental.getActualReturnTime(),
                rental.getReturnPhotosUrls(),
                rental.getScanOfTheReturnProtocolUrl(),
                rental.getDamageIds()
        );
    }
}
