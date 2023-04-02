package com.carflow.backend.module.placeModule.infrastructure.boundary.in.WebApi.v_0_0_1.controller;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.placeModule.domain.model.Place;
import com.carflow.backend.module.placeModule.domain.service.PlaceService;
import com.carflow.backend.module.placeModule.infrastructure.boundary.in.WebApi.v_0_0_1.helper.PlaceApiConverter;
import com.carflow.backend.module.placeModule.infrastructure.boundary.in.WebApi.v_0_0_1.model.PlaceDto;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.helper.PlaceConverter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1/places")
public class PlaceRestApi {
    private final PlaceService placeService;

    private final PlaceApiConverter placeApiConverter;

    public PlaceRestApi(PlaceService placeService, PlaceApiConverter placeApiConverter) {
        this.placeService = placeService;
        this.placeApiConverter = placeApiConverter;
    }

    @PostMapping()
    public PlaceDto createNewPlace(@RequestBody PlaceDto placeDto) {
        Place place = placeService.createNewPlace(placeApiConverter.convertPlaceDtoToPlace(placeDto));
        return placeApiConverter.convertPlaceToPlaceDto(place);
    }

    @GetMapping()
    public List<PlaceDto> getAllPlaces() {
        return placeService.getAllPlaces().stream().map(placeApiConverter::convertPlaceToPlaceDto).toList();
    }

    @GetMapping("/{id}")
    public PlaceDto getPlaceById(@PathVariable String id) throws ObjectNotFoundException {
        return placeApiConverter.convertPlaceToPlaceDto(placeService.getPlaceById(id));
    }

    @PutMapping("/{id}")
    public PlaceDto updatePlaceById(@PathVariable String id, @RequestBody PlaceDto placeDto) throws ObjectNotFoundException {
        Place place = placeApiConverter.convertPlaceDtoToPlace(placeDto);
        Place responsePlace = placeService.updatePlaceById(id, place);
        return placeApiConverter.convertPlaceToPlaceDto(responsePlace);
    }

    @DeleteMapping("/{id}")
    public void deletePlaceById(@PathVariable String id) throws ObjectNotFoundException {
        placeService.deletePlaceById(id);
    }
}
