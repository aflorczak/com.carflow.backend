package com.carflow.backend.infrastructure.boundaries.in.api.forClient.v_0_0_1.branch.cars.entities;

public class BranchCarDto {
    private Integer id;
    private String brand;
    private String model;
    private String fuel;
    private Integer numberOfSeats;
    private Integer numberOfDoors;
    private String bodyType;
    private String segment;
    private String VIN;
    private String registrationNumber;

    public BranchCarDto(Integer id, String brand, String model, String fuel, Integer numberOfSeats, Integer numberOfDoors, String bodyType, String segment, String VIN, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
        this.segment = segment;
        this.VIN = VIN;
        this.registrationNumber = registrationNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
