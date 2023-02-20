package com.carflow.backend.domains.cars.entity;

public class Car {
    private String brand;
    private String model;
    private String registrationNumber;

    public Car(String brand, String model, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
