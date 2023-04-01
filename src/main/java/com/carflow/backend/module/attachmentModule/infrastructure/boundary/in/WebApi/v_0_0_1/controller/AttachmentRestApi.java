package com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.controller;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.attachmentModule.domain.model.Attachment;
import com.carflow.backend.module.attachmentModule.domain.service.AttachmentService;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.helper.AttachmentConverter;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.model.AttachmentDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1")
public class AttachmentRestApi {
    private AttachmentService attachmentService;
    private AttachmentConverter attachmentConverter;
    public AttachmentRestApi(
            AttachmentService attachmentService,
            AttachmentConverter attachmentConverter
    ) {
        this.attachmentService = attachmentService;
        this.attachmentConverter = attachmentConverter;
    }

    @PostMapping("/attachments")
    public AttachmentDto createNewAttachment(@RequestBody AttachmentDto attachmentDto) {
        Attachment attachment = attachmentService.createNewAttachment(attachmentConverter.convertAttachmentDtoToAttachment(attachmentDto));
        return attachmentConverter.convertAttachmentToAttachmentDto(attachment);
    }

    @GetMapping("/attachments")
    public List<AttachmentDto> getAllAttachments() {
        List<Attachment> attachments = attachmentService.getAllAttachments();
        return attachments.stream().map(attachmentConverter::convertAttachmentToAttachmentDto).toList();
    }

    @GetMapping("/attachments/{id}")
    public AttachmentDto getAttachmentById(@PathVariable String id) throws ObjectNotFoundException {
        return attachmentConverter.convertAttachmentToAttachmentDto(attachmentService.getAttachmentById(id));
    }

    @PutMapping("/attachments/{id}")
    public AttachmentDto updateAttachmentById(@PathVariable String id, @RequestBody AttachmentDto attachmentDto) throws ObjectNotFoundException {
        Attachment updatedAttachment = attachmentConverter.convertAttachmentDtoToAttachment(attachmentDto);
        Attachment attachmentResponse = attachmentService.updateAttachmentById(id, updatedAttachment);
        return attachmentConverter.convertAttachmentToAttachmentDto(attachmentResponse);
    }

    @DeleteMapping("/attachments/{id}")
    public void deleteAttachmentById(@PathVariable String id) throws ObjectNotFoundException {
        attachmentService.deleteAttachmentById(id);
    }
}
