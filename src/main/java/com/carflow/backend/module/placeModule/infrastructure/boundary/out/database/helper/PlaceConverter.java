package com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.helper;

import com.carflow.backend.module.placeModule.domain.model.Place;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.entity.PlaceEntity;
import org.springframework.stereotype.Service;

@Service
public class PlaceConverter {
    public PlaceEntity convertPlaceToPlaceEntity(Place place) {
        PlaceEntity placeEntity = new PlaceEntity();
        placeEntity.setId(place.getId());
        placeEntity.setStreet(place.getStreet());
        placeEntity.setBuildingNumber(place.getBuildingNumber());
        placeEntity.setApartmentNumber(place.getApartmentNumber());
        placeEntity.setPostCode(place.getPostCode());
        placeEntity.setCity(place.getCity());
        placeEntity.setCountry(place.getCountry());
        return placeEntity;
    }

    public Place convertPlaceEntityToPlace(PlaceEntity placeEntity) {
        Place place = new Place();
        place.setId(placeEntity.getId());
        place.setStreet(placeEntity.getStreet());
        place.setBuildingNumber(placeEntity.getBuildingNumber());
        place.setApartmentNumber(placeEntity.getApartmentNumber());
        place.setPostCode(placeEntity.getPostCode());
        place.setCity(placeEntity.getCity());
        place.setCountry(place.getCountry());
        return place;
    }
}
