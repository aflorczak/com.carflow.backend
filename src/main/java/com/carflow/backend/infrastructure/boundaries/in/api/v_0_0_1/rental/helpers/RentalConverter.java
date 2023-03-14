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
                rentalDto.getRealDeliveryAddress(),
                rentalDto.getRealReturnDate(),
                rentalDto.getRealDeliveryTime(),
                rentalDto.getScanOfTheContractUrl(),
                rentalDto.getScansOfTheRegulationsUrls(),
                rentalDto.getScanOfTheDeliveryProtocolUrl(),
                rentalDto.getDeliveryPhotosUrls(),
                rentalDto.getRealReturnAddress(),
                rentalDto.getRealReturnDate(),
                rentalDto.getRealReturnTime(),
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
                rental.getRealDeliveryAddress(),
                rental.getRealReturnDate(),
                rental.getRealDeliveryTime(),
                rental.getScanOfTheContractUrl(),
                rental.getScansOfTheRegulationsUrls(),
                rental.getScanOfTheDeliveryProtocolUrl(),
                rental.getDeliveryPhotosUrls(),
                rental.getRealReturnAddress(),
                rental.getRealReturnDate(),
                rental.getRealReturnTime(),
                rental.getReturnPhotosUrls(),
                rental.getScanOfTheReturnProtocolUrl(),
                rental.getDamageIds()
        );
    }
}
