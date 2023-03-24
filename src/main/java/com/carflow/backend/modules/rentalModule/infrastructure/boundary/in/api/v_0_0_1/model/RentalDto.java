package com.carflow.backend.modules.rentalModule.infrastructure.boundary.in.api.v_0_0_1.model;

import java.time.LocalDateTime;
import java.util.List;

public class RentalDto {
    private Integer id;
    private Boolean archive;
    private String orderId;
    private Integer carId;
    private String actualDeliveryAddress;
    private LocalDateTime actualDeliveryDateTime;
    private String scanOfTheContractUrl;
    private String scansOfTheRegulationsUrls;
    private String scanOfTheDeliveryProtocolUrl;
    private String deliveryPhotosUrls;
    private String actualReturnAddress;
    private LocalDateTime actualReturnDateTime;
    private String returnPhotosUrls;
    private String scanOfTheReturnProtocolUrl;
    private List<String> damageIds;

    public RentalDto(Integer id, Boolean archive, String orderId, Integer carId, String actualDeliveryAddress, LocalDateTime actualDeliveryDateTime, String scanOfTheContractUrl, String scansOfTheRegulationsUrls, String scanOfTheDeliveryProtocolUrl, String deliveryPhotosUrls, String actualReturnAddress, LocalDateTime actualReturnDateTime, String returnPhotosUrls, String scanOfTheReturnProtocolUrl, List<String> damageIds) {
        this.id = id;
        this.archive = archive;
        this.orderId = orderId;
        this.carId = carId;
        this.actualDeliveryAddress = actualDeliveryAddress;
        this.actualDeliveryDateTime = actualDeliveryDateTime;
        this.scanOfTheContractUrl = scanOfTheContractUrl;
        this.scansOfTheRegulationsUrls = scansOfTheRegulationsUrls;
        this.scanOfTheDeliveryProtocolUrl = scanOfTheDeliveryProtocolUrl;
        this.deliveryPhotosUrls = deliveryPhotosUrls;
        this.actualReturnAddress = actualReturnAddress;
        this.actualReturnDateTime = actualReturnDateTime;
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

    public LocalDateTime getActualDeliveryDateTime() {
        return actualDeliveryDateTime;
    }

    public void setActualDeliveryDateTime(LocalDateTime actualDeliveryDateTime) {
        this.actualDeliveryDateTime = actualDeliveryDateTime;
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

    public LocalDateTime getActualReturnDateTime() {
        return actualReturnDateTime;
    }

    public void setActualReturnDateTime(LocalDateTime actualReturnDateTime) {
        this.actualReturnDateTime = actualReturnDateTime;
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

    public List<String> getDamageIds() {
        return damageIds;
    }

    public void setDamageIds(List<String> damageIds) {
        this.damageIds = damageIds;
    }
}
