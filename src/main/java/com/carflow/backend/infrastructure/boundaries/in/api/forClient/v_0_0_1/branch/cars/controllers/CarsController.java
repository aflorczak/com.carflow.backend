package com.carflow.backend.infrastructure.boundaries.in.api.forClient.v_0_0_1.branch.cars.controllers;

import com.carflow.backend.infrastructure.boundaries.in.api.forClient.v_0_0_1.branch.cars.entities.BranchCarDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/for-client/v-0.0.1/{branchSlug}")
public class CarsController {
    @GetMapping("/cars")
    public List<BranchCarDto> getBranchCars(@PathVariable String branchSlug) {
        List<BranchCarDto> cars = new ArrayList<>();
        cars.add(
                new BranchCarDto(1, false, "Opel", "Astra", "Pb95", 5, 5, "Combi", "C", "numer vin", "DLK 5F147")
        );
        return cars;
    }

    @GetMapping("/cars/{carId}")
    public BranchCarDto getBranchCarById(@PathVariable String branchSlug, @PathVariable String carId) {
        return new BranchCarDto(1, false, "Opel", "Astra", "Pb95", 5, 5, "Combi", "C", "numer vin", "DLK 5F147");
    }
}
