package com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.controller;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.rentalModule.domain.model.Rental;
import com.carflow.backend.module.rentalModule.domain.service.RentalService;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.helper.RentalApiConverter;
import com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.model.RentalDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1/rentals")
public class RentalRestApi {
    private final RentalService service;
    private final RentalApiConverter rentalApiConverter;

    public RentalRestApi(RentalService service, RentalApiConverter rentalApiConverter) {
        this.service = service;
        this.rentalApiConverter = rentalApiConverter;
    }

    @PostMapping()
    public RentalDto createNewRental(@RequestBody RentalDto rentalDto) {
        Rental rental = service.createNewRental(rentalApiConverter.convertRentalDtoToRental(rentalDto));
        return rentalApiConverter.convertRentalToRentalDto(rental);
    }

    @GetMapping()
    public List<RentalDto> getAllRentals() {
        return service.getAllRentals().stream().map(rentalApiConverter::convertRentalToRentalDto).toList();
    }

    @GetMapping("/{id}")
    public RentalDto getRentalById(@PathVariable String id) throws ObjectNotFoundException {
        Rental rental = service.getRentalById(id);
        return rentalApiConverter.convertRentalToRentalDto(rental);
    }

    @PutMapping("/{id}")
    public RentalDto updateRentalById(@PathVariable String id, @RequestBody RentalDto rentalDto) throws ObjectNotFoundException {
        Rental updatedRental = rentalApiConverter.convertRentalDtoToRental(rentalDto);
        Rental rentalResponse = service.updateRentalById(id, updatedRental);
        return rentalApiConverter.convertRentalToRentalDto(rentalResponse);
    }

    @DeleteMapping("/{id}")
    public void deleteRentalById(@PathVariable String id) throws ObjectNotFoundException {
        service.deleteRentalById(id);
    }
}
