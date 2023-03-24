package com.carflow.backend.modules.carModule.infrastructure.boundary.out.entity;

import com.carflow.backend.modules.carModule.customEnum.FuelType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CarEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private Boolean archive;
    private String branchSlug;
    private String brand;
    private String model;
    private Integer mileage;
    private FuelType fuel;
    private Integer numberOfSeats;
    private Integer numberOfDoors;
    private String bodyType;
    private String segment;
    private String VIN;
    private String registrationNumber;
    private String technicalExaminationDate;
    private String endDateOfInsurance;
    private String damagedDescription;
    private String damagedPhotosUrls;

    public CarEntity() {
    }

    public CarEntity(Integer id, Boolean archive, String branchSlug, String brand, String model, Integer mileage, FuelType fuel, Integer numberOfSeats, Integer numberOfDoors, String bodyType, String segment, String VIN, String registrationNumber, String technicalExaminationDate, String endDateOfInsurance, String damagedDescription, String damagedPhotosUrls) {
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

    public Boolean getArchive() {
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
