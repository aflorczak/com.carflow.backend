package com.carflow.backend.infrastructure.boundaries.in.api.v_0_0_1.order.entities;


public class OrderDto {
    private Integer id;
    private String status;
    private String clientsData;
    private String principal;
    private String internalCaseNumber;
    private String externalCaseNumber;
    private String segment;
    private String deliveryAddress;
    private String deliveryDate;
    private String deliveryTime;
    private String deliveryComments;
    private String deliveryBranch;
    private String returnAddress;
    private String returnDate;
    private String returnTime;
    private String returnComments;
    private String returnBranch;
    private Boolean archive;
    private String reasonForCancelingTheOrder;

    public OrderDto(Integer id, String status, String clientsData, String principal, String internalCaseNumber, String externalCaseNumber, String segment, String deliveryAddress, String deliveryDate, String deliveryTime, String deliveryComments, String deliveryBranch, String returnAddress, String returnDate, String returnTime, String returnComments, String returnBranch, Boolean archive, String reasonForCancelingTheOrder) {
        this.id = id;
        this.status = status;
        this.clientsData = clientsData;
        this.principal = principal;
        this.internalCaseNumber = internalCaseNumber;
        this.externalCaseNumber = externalCaseNumber;
        this.segment = segment;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.deliveryComments = deliveryComments;
        this.deliveryBranch = deliveryBranch;
        this.returnAddress = returnAddress;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.returnComments = returnComments;
        this.returnBranch = returnBranch;
        this.archive = archive;
        this.reasonForCancelingTheOrder = reasonForCancelingTheOrder;
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

    public String getClientsData() {
        return clientsData;
    }

    public void setClientsData(String clientsData) {
        this.clientsData = clientsData;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getInternalCaseNumber() {
        return internalCaseNumber;
    }

    public void setInternalCaseNumber(String internalCaseNumber) {
        this.internalCaseNumber = internalCaseNumber;
    }

    public String getExternalCaseNumber() {
        return externalCaseNumber;
    }

    public void setExternalCaseNumber(String externalCaseNumber) {
        this.externalCaseNumber = externalCaseNumber;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryComments() {
        return deliveryComments;
    }

    public void setDeliveryComments(String deliveryComments) {
        this.deliveryComments = deliveryComments;
    }

    public String getDeliveryBranch() {
        return deliveryBranch;
    }

    public void setDeliveryBranch(String deliveryBranch) {
        this.deliveryBranch = deliveryBranch;
    }

    public String getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(String returnAddress) {
        this.returnAddress = returnAddress;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnComments() {
        return returnComments;
    }

    public void setReturnComments(String returnComments) {
        this.returnComments = returnComments;
    }

    public String getReturnBranch() {
        return returnBranch;
    }

    public void setReturnBranch(String returnBranch) {
        this.returnBranch = returnBranch;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public String getReasonForCancelingTheOrder() {
        return reasonForCancelingTheOrder;
    }

    public void setReasonForCancelingTheOrder(String reasonForCancelingTheOrder) {
        this.reasonForCancelingTheOrder = reasonForCancelingTheOrder;
    }
}
