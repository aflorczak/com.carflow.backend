package com.carflow.backend.infrastructure.boundaries.in.rental.entities;

public class RentalDto {
    private Integer id;
    private String ordersId;
    private Integer carId;
    private String deliveryAddress;
    private String deliveryTime;
    private String scanOfTheContractUrl;
    private String scansOfTheRegulationsUrls;
    private String scanOfTheDeliveryProtocolUrl;
    private String deliveryPhotosUrls;
    private String returnAddress;
    private String returnTime;
    private String returnPhotosUrls;
    private String scanOfTheReturnProtocolUrl;
    private boolean damagedVehicle;
    private String damagedDescription;
    private String damagedPhotosUrls;

    public RentalDto(Integer id, String ordersId, Integer carId, String deliveryAddress, String deliveryTime, String scanOfTheContractUrl, String scansOfTheRegulationsUrls, String scanOfTheDeliveryProtocolUrl, String deliveryPhotosUrls, String returnAddress, String returnTime, String returnPhotosUrls, String scanOfTheReturnProtocolUrl, boolean damagedVehicle, String damagedDescription, String damagedPhotosUrls) {
        this.id = id;
        this.ordersId = ordersId;
        this.carId = carId;
        this.deliveryAddress = deliveryAddress;
        this.deliveryTime = deliveryTime;
        this.scanOfTheContractUrl = scanOfTheContractUrl;
        this.scansOfTheRegulationsUrls = scansOfTheRegulationsUrls;
        this.scanOfTheDeliveryProtocolUrl = scanOfTheDeliveryProtocolUrl;
        this.deliveryPhotosUrls = deliveryPhotosUrls;
        this.returnAddress = returnAddress;
        this.returnTime = returnTime;
        this.returnPhotosUrls = returnPhotosUrls;
        this.scanOfTheReturnProtocolUrl = scanOfTheReturnProtocolUrl;
        this.damagedVehicle = damagedVehicle;
        this.damagedDescription = damagedDescription;
        this.damagedPhotosUrls = damagedPhotosUrls;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
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

    public String getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(String returnAddress) {
        this.returnAddress = returnAddress;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
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

    public boolean isDamagedVehicle() {
        return damagedVehicle;
    }

    public void setDamagedVehicle(boolean damagedVehicle) {
        this.damagedVehicle = damagedVehicle;
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
