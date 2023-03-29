//package com.carflow.backend.module.rentalModule.infrastructure.boundary.in.webApi.v_0_0_1.model;
//
//import com.carflow.backend.module.attachmentModule.domain.model.Attachment;
//import com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.model.AttachmentDto;
//import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
//import com.carflow.backend.module.carModule.domain.model.Car;
//import com.carflow.backend.module.carModule.infrastructure.boundary.in.webApi.v_0_0_1.entities.CarDto;
//import com.carflow.backend.module.carModule.infrastructure.boundary.out.database.entity.CarEntity;
//import com.carflow.backend.module.operationModule.domain.model.Operation;
//import com.carflow.backend.module.operationModule.infrastructure.boundary.in.webApi.v_0_0_1.model.OperationDto;
//import com.carflow.backend.module.operationModule.infrastructure.boundary.out.database.entity.OperationEntity;
//import com.carflow.backend.module.orderModule.domain.model.Order;
//import com.carflow.backend.module.orderModule.infrastructure.boundary.in.webApi.v_0_0_1.entity.OrderDto;
//import com.carflow.backend.module.orderModule.infrastructure.boundary.out.database.entity.OrderEntity;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//public class RentalDto {
//    private Integer id;
//    private Boolean archived;
//    private OrderDto order;
//    private CarDto car;
//    private List<AttachmentDto> attachments;
//    private OperationDto deliveryOperation;
//    private OperationDto returnOperation;
//
//    public RentalDto() {
//    }
//
//    public RentalDto(Integer id, Boolean archived, OrderDto order, CarDto car, List<AttachmentDto> attachments, OperationDto deliveryOperation, OperationDto returnOperation) {
//        this.id = id;
//        this.archived = archived;
//        this.order = order;
//        this.car = car;
//        this.attachments = attachments;
//        this.deliveryOperation = deliveryOperation;
//        this.returnOperation = returnOperation;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Boolean getArchived() {
//        return archived;
//    }
//
//    public void setArchived(Boolean archived) {
//        this.archived = archived;
//    }
//
//    public OrderDto getOrder() {
//        return order;
//    }
//
//    public void setOrder(OrderDto order) {
//        this.order = order;
//    }
//
//    public CarDto getCar() {
//        return car;
//    }
//
//    public void setCar(CarDto car) {
//        this.car = car;
//    }
//
//    public List<AttachmentDto> getAttachments() {
//        return attachments;
//    }
//
//    public void setAttachments(List<AttachmentDto> attachments) {
//        this.attachments = attachments;
//    }
//
//    public OperationDto getDeliveryOperation() {
//        return deliveryOperation;
//    }
//
//    public void setDeliveryOperation(OperationDto deliveryOperation) {
//        this.deliveryOperation = deliveryOperation;
//    }
//
//    public OperationDto getReturnOperation() {
//        return returnOperation;
//    }
//
//    public void setReturnOperation(OperationDto returnOperation) {
//        this.returnOperation = returnOperation;
//    }
//}
