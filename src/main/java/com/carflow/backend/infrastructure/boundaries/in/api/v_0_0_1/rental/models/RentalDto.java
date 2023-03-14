package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.rental.models;

public class RentalDto {
    private Integer id;
    private Boolean archive;
    private String orderId;
    private Integer carId;
    private String realDeliveryAddress;
    private String realDeliveryDate;
    private String realDeliveryTime;
    private String scanOfTheContractUrl;
    private String scansOfTheRegulationsUrls;
    private String scanOfTheDeliveryProtocolUrl;
    private String deliveryPhotosUrls;
    private String realReturnAddress;
    private String realReturnDate;
    private String realReturnTime;
    private String returnPhotosUrls;
    private String scanOfTheReturnProtocolUrl;
    private String damageIds;

    public RentalDto(Integer id, Boolean archive, String orderId, Integer carId, String realDeliveryAddress, String realDeliveryDate, String realDeliveryTime, String scanOfTheContractUrl, String scansOfTheRegulationsUrls, String scanOfTheDeliveryProtocolUrl, String deliveryPhotosUrls, String realReturnAddress, String realReturnDate, String realReturnTime, String returnPhotosUrls, String scanOfTheReturnProtocolUrl, String damageIds) {
        this.id = id;
        this.archive = archive;
        this.orderId = orderId;
        this.carId = carId;
        this.realDeliveryAddress = realDeliveryAddress;
        this.realDeliveryDate = realDeliveryDate;
        this.realDeliveryTime = realDeliveryTime;
        this.scanOfTheContractUrl = scanOfTheContractUrl;
        this.scansOfTheRegulationsUrls = scansOfTheRegulationsUrls;
        this.scanOfTheDeliveryProtocolUrl = scanOfTheDeliveryProtocolUrl;
        this.deliveryPhotosUrls = deliveryPhotosUrls;
        this.realReturnAddress = realReturnAddress;
        this.realReturnDate = realReturnDate;
        this.realReturnTime = realReturnTime;
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

    public String getRealDeliveryAddress() {
        return realDeliveryAddress;
    }

    public void setRealDeliveryAddress(String realDeliveryAddress) {
        this.realDeliveryAddress = realDeliveryAddress;
    }

    public String getRealDeliveryDate() {
        return realDeliveryDate;
    }

    public void setRealDeliveryDate(String realDeliveryDate) {
        this.realDeliveryDate = realDeliveryDate;
    }

    public String getRealDeliveryTime() {
        return realDeliveryTime;
    }

    public void setRealDeliveryTime(String realDeliveryTime) {
        this.realDeliveryTime = realDeliveryTime;
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

    public String getRealReturnAddress() {
        return realReturnAddress;
    }

    public void setRealReturnAddress(String realReturnAddress) {
        this.realReturnAddress = realReturnAddress;
    }

    public String getRealReturnDate() {
        return realReturnDate;
    }

    public void setRealReturnDate(String realReturnDate) {
        this.realReturnDate = realReturnDate;
    }

    public String getRealReturnTime() {
        return realReturnTime;
    }

    public void setRealReturnTime(String realReturnTime) {
        this.realReturnTime = realReturnTime;
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
