package com.carflow.backend.module.placeModule.infrastructure.boundary.in.WebApi.v_0_0_1.helper;

import com.carflow.backend.module.placeModule.domain.model.Place;
import com.carflow.backend.module.placeModule.infrastructure.boundary.in.WebApi.v_0_0_1.model.PlaceDto;
import org.springframework.stereotype.Service;

@Service
public class PlaceApiConverter {
    public Place convertPlaceDtoToPlace(PlaceDto placeDto) {
        Place place = new Place();
        place.setId(placeDto.getId());
        place.setArchived(placeDto.getArchived());
        place.setStreet(placeDto.getStreet());
        place.setBuildingNumber(placeDto.getBuildingNumber());
        place.setApartmentNumber(placeDto.getApartmentNumber());
        place.setPostCode(placeDto.getPostCode());
        place.setCity(placeDto.getCity());
        place.setCountry(placeDto.getCountry());
        return place;
    }

    public PlaceDto convertPlaceToPlaceDto(Place place) {
        PlaceDto placeDto = new PlaceDto();
        placeDto.setId(place.getId());
        placeDto.setArchived(place.getArchived());
        placeDto.setStreet(place.getStreet());
        placeDto.setBuildingNumber(place.getBuildingNumber());
        placeDto.setApartmentNumber(place.getApartmentNumber());
        placeDto.setPostCode(place.getPostCode());
        placeDto.setCity(place.getCity());
        placeDto.setCountry(place.getCountry());
        return placeDto;
    }
}
