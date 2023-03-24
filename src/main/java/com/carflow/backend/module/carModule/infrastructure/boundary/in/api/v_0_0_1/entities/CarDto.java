package com.carflow.backend.module.carModule.infrastructure.boundary.in.api.v_0_0_1.entities;

import com.carflow.backend.customEnum.BodyType;
import com.carflow.backend.customEnum.CarSegment;
import com.carflow.backend.customEnum.FuelType;

import java.time.LocalDate;

public class CarDto {
    // System properties
    private Integer id;
    private Boolean archive;

    private String branchSlug;

    // Technical properties
    private String brand;
    private String model;
    private Integer mileage;
    private FuelType fuel;
    private Integer numberOfSeats;
    private Integer numberOfDoors;
    private BodyType bodyType;
    private CarSegment segment;

    // Legal properties
    private String VIN;
    private String registrationNumber;
    private LocalDate technicalExaminationDate;
    private LocalDate endDateOfInsurance;
    private String damagedDescription;
    private String damagedPhotosUrls;

    public CarDto(Integer id, Boolean archive, String branchSlug, String brand, String model, Integer mileage, FuelType fuel, Integer numberOfSeats, Integer numberOfDoors, BodyType bodyType, CarSegment segment, String VIN, String registrationNumber, LocalDate technicalExaminationDate, LocalDate endDateOfInsurance, String damagedDescription, String damagedPhotosUrls) {
        this.id = id;
        this.archive = archive;
        this.branchSlug = branchSlug;
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
        this.segment = segment;
        this.VIN = VIN;
        this.registrationNumber = registrationNumber;
        this.technicalExaminationDate = technicalExaminationDate;
        this.endDateOfInsurance = endDateOfInsurance;
        this.damagedDescription = damagedDescription;
        this.damagedPhotosUrls = damagedPhotosUrls;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public String getBranchSlug() {
        return branchSlug;
    }

    public void setBranchSlug(String branchSlug) {
        this.branchSlug = branchSlug;
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

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public CarSegment getSegment() {
        return segment;
    }

    public void setSegment(CarSegment segment) {
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

    public LocalDate getTechnicalExaminationDate() {
        return technicalExaminationDate;
    }

    public void setTechnicalExaminationDate(LocalDate technicalExaminationDate) {
        this.technicalExaminationDate = technicalExaminationDate;
    }

    public LocalDate getEndDateOfInsurance() {
        return endDateOfInsurance;
    }

    public void setEndDateOfInsurance(LocalDate endDateOfInsurance) {
        this.endDateOfInsurance = endDateOfInsurance;
    }

    public String getDamagedDescription() {
        return damagedDescription;
    }

    public void setDamagedDescription(String damagedDescription) {
        this.damagedDescription = damagedDescription;
    }

    public String getDamagedPhotosUrls() {
        return damagedPhotosUrls;
    }

    public void setDamagedPhotosUrls(String damagedPhotosUrls) {
        this.damagedPhotosUrls = damagedPhotosUrls;
    }
}
