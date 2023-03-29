package com.carflow.backend.module.placeModule.domain.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.placeModule.domain.interfaces.PlaceStorage;
import com.carflow.backend.module.placeModule.domain.model.Place;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    private final PlaceStorage placeStorage;

    public PlaceService(PlaceStorage placeStorage) {
        this.placeStorage = placeStorage;
    }

    public Place createNewPlace(Place place) {
        return placeStorage.createNewPlace(place);
    }

    public List<Place> getAllPlaces() {
        return placeStorage.getAllPlaces();
    }

    public Place getPlaceById(String id) throws ObjectNotFoundException {
        return placeStorage.getPlaceById(id);
    }

    public Place updatePlaceById(String id, Place updatedPlace) throws ObjectNotFoundException {
        return placeStorage.updatePlaceById(id, updatedPlace);
    }

    public void deletePlaceById(String id) throws ObjectNotFoundException {
        placeStorage.deleteOrderById(id);
    }
}
