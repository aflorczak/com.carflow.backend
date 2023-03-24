package com.carflow.backend.modules.rentalModule.infrastructure.boundary.in.api.v_0_0_1.controller;

import com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.entity.RentalEntity;
import com.carflow.backend.modules.rentalModule.infrastructure.boundary.out.repository.RentalRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/rentals")
public class TestRentalRestApi {
    private final RentalRepository rentalRepository;
    public TestRentalRestApi(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @GetMapping("/{id}")
    public RentalEntity getRentalById(@PathVariable String id) {
        System.out.println("Id: " + id);
        System.out.println(rentalRepository.findById(id).get().toString());
        //return rentalRepository.findById(id).get();
        return null;
    }
}
