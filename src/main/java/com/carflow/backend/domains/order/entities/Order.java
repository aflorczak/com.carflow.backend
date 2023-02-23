package com.carflow.backend.domains.order.entities;

import java.util.List;

public class Order {
    private Integer id;
    private String status;
    private String principal;
    private String caseNumber;
    private String deliveryAddress;
    private String deliveryTime;
    private String returnAddress;
    private String returnTime;
    private String drivers;
    private String comments;
    private String segment;

    public Order(Integer id, String status, String principal, String caseNumber, String deliveryAddress, String deliveryTime, String returnAddress, String returnTime, String drivers, String comments, String segment) {
        this.id = id;
        this.status = status;
        this.principal = principal;
        this.caseNumber = caseNumber;
        this.deliveryAddress = deliveryAddress;
        this.deliveryTime = deliveryTime;
        this.returnAddress = returnAddress;
        this.returnTime = returnTime;
        this.drivers = drivers;
        this.comments = comments;
        this.segment = segment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
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

    public String getDrivers() {
        return drivers;
    }

    public void setDrivers(String drivers) {
        this.drivers = drivers;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }
}
