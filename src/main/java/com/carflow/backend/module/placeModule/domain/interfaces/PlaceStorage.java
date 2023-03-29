package com.carflow.backend.module.placeModule.domain.interfaces;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.orderModule.domain.model.Order;
import com.carflow.backend.module.placeModule.domain.model.Place;

import java.util.List;

public interface PlaceStorage {
    Place createNewPlace(Place place);
    List<Place> getAllPlaces();
    Place getPlaceById(String id) throws ObjectNotFoundException;
    Place updatePlaceById(String id, Place place) throws ObjectNotFoundException;
    void deleteOrderById(String id) throws ObjectNotFoundException;
}
