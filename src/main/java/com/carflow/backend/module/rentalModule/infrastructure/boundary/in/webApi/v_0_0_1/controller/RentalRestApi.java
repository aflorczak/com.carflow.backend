//package com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.controller;
//
//import com.carflow.backend.exception.ObjectNotFoundException;
//import com.carflow.backend.module.rentalModule.domain.service.RentalService;
//import com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.helper.RentalApiConverter;
//import com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.model.RentalDto;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v-0.0.1")
//public class RentalRestApi {
//    private final RentalService service;
//    private final RentalApiConverter rentalApiConverter;
//
//    public RentalRestApi(RentalService service, RentalApiConverter rentalApiConverter) {
//        this.service = service;
//        this.rentalApiConverter = rentalApiConverter;
//    }
//
//    @PostMapping("/rentals")
//    public RentalDto createNewRental(@RequestBody RentalDto rentalDto) {
//        return null;
//    }
//
//    @GetMapping("/rentals")
//    public List<RentalDto> getAllRentals() {
//        return service.getAllRentals().stream().map(rentalApiConverter::convertRentalToRentalDto).toList();
//    }
//
//    @GetMapping("/rentals/{id}")
//    public RentalDto getRentalById(@PathVariable String id) throws ObjectNotFoundException {
//        return null;
//    }
//
//    @PutMapping("/rentals/{id}")
//    public RentalDto updateRentalById(@PathVariable String id, @RequestBody RentalDto rentalDto) throws ObjectNotFoundException {
//        return null;
//    }
//
//    @DeleteMapping("/rentals/{id}")
//    public void deleteRentalById(@PathVariable String id) throws ObjectNotFoundException {
//
//    }
//}
