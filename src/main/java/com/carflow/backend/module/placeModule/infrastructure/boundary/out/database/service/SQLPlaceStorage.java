package com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.placeModule.domain.interfaces.PlaceStorage;
import com.carflow.backend.module.placeModule.domain.model.Place;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.entity.PlaceEntity;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.helper.PlaceConverter;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.repository.PlaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SQLPlaceStorage implements PlaceStorage {

    private final PlaceRepository placeRepository;
    private final PlaceConverter placeConverter;

    public SQLPlaceStorage(PlaceRepository placeRepository, PlaceConverter placeConverter) {
        this.placeRepository = placeRepository;
        this.placeConverter = placeConverter;
    }

    @Override
    public Place createNewPlace(Place place) {
        return placeConverter.convertPlaceEntityToPlace(placeRepository.save(placeConverter.convertPlaceToPlaceEntity(place)));
    }

    @Override
    public List<Place> getAllPlaces() {
        return placeRepository.findAll().stream().map(placeConverter::convertPlaceEntityToPlace).toList();
    }

    @Override
    public Place getPlaceById(String id) throws ObjectNotFoundException {
        Optional<PlaceEntity> placeEntity = placeRepository.findById(id);
        if (placeEntity.isPresent()) {
            return placeConverter.convertPlaceEntityToPlace(placeEntity.get());
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }

    @Override
    public Place updatePlaceById(String id, Place place) throws ObjectNotFoundException {
        return placeConverter.convertPlaceEntityToPlace(placeRepository.save(placeConverter.convertPlaceToPlaceEntity(place)));
    }

    @Override
    public void deleteOrderById(String id) throws ObjectNotFoundException {
        Optional<PlaceEntity> placeEntity = placeRepository.findById(id);
        if (placeEntity.isPresent()) {
            placeRepository.deleteById(id);
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }
}
