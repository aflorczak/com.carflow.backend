package com.carflow.backend.domains.cars.entities;

public class Car {

    // System properties
    private Integer id;

    // Technical properties
    private String brand;
    private String model;
    private Integer mileage;
    private String fuel;
    private Integer numberOfSeats;
    private Integer numberOfDoors;
    private String bodyType;

    // Legal properties
    private String VIN;
    private String registrationNumber;
    private String technicalExaminationDate;
    private String endDateOfInsurance;

    public Car(
            Integer id,
            String brand,
            String model,
            Integer mileage,
            String fuel,
            Integer numberOfSeats,
            Integer numberOfDoors,
            String bodyType,
            String VIN,
            String registrationNumber,
            String technicalExaminationDate,
            String endDateOfInsurance) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
        this.VIN = VIN;
        this.registrationNumber = registrationNumber;
        this.technicalExaminationDate = technicalExaminationDate;
        this.endDateOfInsurance = endDateOfInsurance;
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

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
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

    public String getTechnicalExaminationDate() {
        return technicalExaminationDate;
    }

    public void setTechnicalExaminationDate(String technicalExaminationDate) {
        this.technicalExaminationDate = technicalExaminationDate;
    }

    public String getEndDateOfInsurance() {
        return endDateOfInsurance;
    }

    public void setEndDateOfInsurance(String endDateOfInsurance) {
        this.endDateOfInsurance = endDateOfInsurance;
    }
}
