package com.carflow.backend.infrastructure.boundaries.in.api.forClient.v_0_0_1.branch.cars.controllers;

import com.carflow.backend.domains.cars.services.CarService;
import com.carflow.backend.infrastructure.boundaries.in.api.forClient.v_0_0_1.branch.cars.entities.CarDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/for-client/v-0.0.1/{branchSlug}")
public class CarsController {

    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<CarDto> getBranchCars(@PathVariable String branchSlug) {
        // napisać tą metodę do końca, serwis sprawdzić i CarDto czy dobre jest tutaj
    }

    @GetMapping("/cars/{carId}")
    public CarDto getBranchCarById(@PathVariable String branchSlug, @PathVariable String carId) {
        return new CarDto(1, false, "Opel", "Astra", "Pb95", 5, 5, "Combi", "C", "numer vin", "DLK 5F147");
    }
}
