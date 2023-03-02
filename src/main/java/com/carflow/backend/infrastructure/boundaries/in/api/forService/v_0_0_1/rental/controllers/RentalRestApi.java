package com.carflow.backend.infrastructure.boundaries.in.api.forService.v_0_0_1.rental.controllers;

import com.carflow.backend.domains.rental.entities.Rental;
import com.carflow.backend.domains.rental.services.RentalService;
import com.carflow.backend.infrastructure.boundaries.in.api.forService.v_0_0_1.rental.helpers.RentalConverter;
import com.carflow.backend.infrastructure.boundaries.in.api.forService.v_0_0_1.rental.entities.RentalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/for-service/v-0.0.1")
public class RentalRestApi {
    private RentalService service;
    private RentalConverter converter;

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
        return rentals.stream().map(rental -> converter.convertRentalToRentalDto(rental)).toList();
    }

    @GetMapping("/rentals/{id}")
    public RentalDto getRentalById(@PathVariable String id) {
        Rental rental = service.getRentalById(id);
        if (!(rental==null)) {
            return converter.convertRentalToRentalDto(rental);
        } else {
            return null;
        }
    }

    @PutMapping("/rentals/{id}")
    public RentalDto updateRentalById(@PathVariable String id, @RequestBody RentalDto rentalRequest) {
        Rental rental = service.updateRentalById(id, converter.convertRentalDtoToRental(rentalRequest));
        return converter.convertRentalToRentalDto(rental);
    }

    @DeleteMapping("/rentals/{id}")
    public void deleteRentalById(@PathVariable String id) {
        service.deleteRentalById(id);
    }
}
