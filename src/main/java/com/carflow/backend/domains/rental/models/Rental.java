package com.carflow.backend.domains.rental.models;

public class Rental {
    private Integer id;
    private Boolean archive;
    private String orderId;
    private Integer carId;
    private String actualDeliveryAddress;
    private String actualDeliveryDate;
    private String actualDeliveryTime;
    private String scanOfTheContractUrl;
    private String scansOfTheRegulationsUrls;
    private String scanOfTheDeliveryProtocolUrl;
    private String deliveryPhotosUrls;
    private String actualReturnAddress;
    private String actualReturnDate;
    private String actualReturnTime;
    private String returnPhotosUrls;
    private String scanOfTheReturnProtocolUrl;
    private String damageIds;

    public Rental(Integer id, Boolean archive, String orderId, Integer carId, String actualDeliveryAddress, String actualDeliveryDate, String actualDeliveryTime, String scanOfTheContractUrl, String scansOfTheRegulationsUrls, String scanOfTheDeliveryProtocolUrl, String deliveryPhotosUrls, String actualReturnAddress, String actualReturnDate, String actualReturnTime, String returnPhotosUrls, String scanOfTheReturnProtocolUrl, String damageIds) {
        this.id = id;
        this.archive = archive;
        this.orderId = orderId;
        this.carId = carId;
        this.actualDeliveryAddress = actualDeliveryAddress;
        this.actualDeliveryDate = actualDeliveryDate;
        this.actualDeliveryTime = actualDeliveryTime;
        this.scanOfTheContractUrl = scanOfTheContractUrl;
        this.scansOfTheRegulationsUrls = scansOfTheRegulationsUrls;
        this.scanOfTheDeliveryProtocolUrl = scanOfTheDeliveryProtocolUrl;
        this.deliveryPhotosUrls = deliveryPhotosUrls;
        this.actualReturnAddress = actualReturnAddress;
        this.actualReturnDate = actualReturnDate;
        this.actualReturnTime = actualReturnTime;
        this.returnPhotosUrls = returnPhotosUrls;
        this.scanOfTheReturnProtocolUrl = scanOfTheReturnProtocolUrl;
        this.damageIds = damageIds;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getActualDeliveryAddress() {
        return actualDeliveryAddress;
    }

    public void setActualDeliveryAddress(String actualDeliveryAddress) {
        this.actualDeliveryAddress = actualDeliveryAddress;
    }

    public String getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public void setActualDeliveryDate(String actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public String getActualDeliveryTime() {
        return actualDeliveryTime;
    }

    public void setActualDeliveryTime(String actualDeliveryTime) {
        this.actualDeliveryTime = actualDeliveryTime;
    }

    public String getScanOfTheContractUrl() {
        return scanOfTheContractUrl;
    }

    public void setScanOfTheContractUrl(String scanOfTheContractUrl) {
        this.scanOfTheContractUrl = scanOfTheContractUrl;
    }

    public String getScansOfTheRegulationsUrls() {
        return scansOfTheRegulationsUrls;
    }

    public void setScansOfTheRegulationsUrls(String scansOfTheRegulationsUrls) {
        this.scansOfTheRegulationsUrls = scansOfTheRegulationsUrls;
    }

    public String getScanOfTheDeliveryProtocolUrl() {
        return scanOfTheDeliveryProtocolUrl;
    }

    public void setScanOfTheDeliveryProtocolUrl(String scanOfTheDeliveryProtocolUrl) {
        this.scanOfTheDeliveryProtocolUrl = scanOfTheDeliveryProtocolUrl;
    }

    public String getDeliveryPhotosUrls() {
        return deliveryPhotosUrls;
    }

    public void setDeliveryPhotosUrls(String deliveryPhotosUrls) {
        this.deliveryPhotosUrls = deliveryPhotosUrls;
    }

    public String getActualReturnAddress() {
        return actualReturnAddress;
    }

    public void setActualReturnAddress(String actualReturnAddress) {
        this.actualReturnAddress = actualReturnAddress;
    }

    public String getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(String actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public String getActualReturnTime() {
        return actualReturnTime;
    }

    public void setActualReturnTime(String actualReturnTime) {
        this.actualReturnTime = actualReturnTime;
    }

    public String getReturnPhotosUrls() {
        return returnPhotosUrls;
    }

    public void setReturnPhotosUrls(String returnPhotosUrls) {
        this.returnPhotosUrls = returnPhotosUrls;
    }

    public String getScanOfTheReturnProtocolUrl() {
        return scanOfTheReturnProtocolUrl;
    }

    public void setScanOfTheReturnProtocolUrl(String scanOfTheReturnProtocolUrl) {
        this.scanOfTheReturnProtocolUrl = scanOfTheReturnProtocolUrl;
    }

    public String getDamageIds() {
        return damageIds;
    }

    public void setDamageIds(String damageIds) {
        this.damageIds = damageIds;
    }
}
