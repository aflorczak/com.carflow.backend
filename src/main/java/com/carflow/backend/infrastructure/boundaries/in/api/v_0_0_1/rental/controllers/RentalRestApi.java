package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.rental.controllers;

import com.carflow.backend.domains.rental.models.Rental;
import com.carflow.backend.domains.rental.services.RentalService;
import com.carflow.backend.exceptions.ObjectNotFoundException;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.rental.helpers.RentalConverter;
import com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.rental.models.RentalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1")
public class RentalRestApi {
    final private RentalService service;
    final private RentalConverter converter;

    @Autowired
    public RentalRestApi(RentalService service, RentalConverter converter) {
        this.service = service;
        this.converter = converter;
    }

    @PostMapping("/rentals")
    public RentalDto createNewRental(@RequestBody RentalDto rentalRequest) {
        Rental rental = service.createNewRental(converter.convertRentalDtoToRental(rentalRequest));
        return converter.convertRentalToRentalDto(rental);
    }
    @GetMapping("/rentals")
    public List<RentalDto> getAllRentals() {
        List<Rental> rentals = service.getAllRentals();
        return rentals.stream().map(converter::convertRentalToRentalDto).toList();
    }

    @GetMapping("/rentals/{id}")
    public RentalDto getRentalById(@PathVariable String id) throws ObjectNotFoundException {
        Rental rental = service.getRentalById(id);
        return converter.convertRentalToRentalDto(rental);
    }

    @PutMapping("/rentals/{id}")
    public RentalDto updateRentalById(@PathVariable String id, @RequestBody RentalDto rentalRequest) throws ObjectNotFoundException {
        Rental rental = service.updateRentalById(id, converter.convertRentalDtoToRental(rentalRequest));
        return converter.convertRentalToRentalDto(rental);
    }

    @DeleteMapping("/rentals/{id}")
    public void deleteRentalById(@PathVariable String id) throws ObjectNotFoundException {
        service.deleteRentalById(id);
    }

    @PostMapping("/rentals/{id}/archive")
    public void moveRentalToArchive(@PathVariable String id) throws ObjectNotFoundException {
        service.moveRentalToArchive(id);
    }
}
