package com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.controller;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.attachmentModule.domain.model.Attachment;
import com.carflow.backend.module.attachmentModule.domain.service.AttachmentService;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.helper.AttachmentConverter;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.helper.AttachmentValidator;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.model.AttachmentDto;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v-0.0.1/attachments")
public class AttachmentRestApi {
    private final AttachmentService attachmentService;
    private final AttachmentConverter attachmentConverter;
    private final AttachmentValidator attachmentValidator;

    public AttachmentRestApi(
            AttachmentService attachmentService,
            AttachmentConverter attachmentConverter,
            AttachmentValidator attachmentValidator
    ) {
        this.attachmentService = attachmentService;
        this.attachmentConverter = attachmentConverter;
        this.attachmentValidator = attachmentValidator;
    }

    @PostMapping()
    public AttachmentDto createNewAttachment(@RequestBody AttachmentDto attachmentDto) throws IllegalArgumentException, IOException {
        attachmentValidator.checkAttachment(attachmentDto);
        Attachment attachment = attachmentService.createNewAttachment(attachmentConverter.convertAttachmentDtoToAttachment(attachmentDto));
        return attachmentConverter.convertAttachmentToAttachmentDto(attachment);
    }

    @GetMapping()
    public List<AttachmentDto> getAllAttachments() {
        List<Attachment> attachments = attachmentService.getAllAttachments();
        return attachments.stream().map(attachmentConverter::convertAttachmentToAttachmentDto).toList();
    }

    @GetMapping("/{id}")
    public AttachmentDto getAttachmentById(@PathVariable String id) throws ObjectNotFoundException {
        return attachmentConverter.convertAttachmentToAttachmentDto(attachmentService.getAttachmentById(id));
    }

    @PutMapping("/{id}")
    public AttachmentDto updateAttachmentById(@PathVariable String id, @RequestBody AttachmentDto attachmentDto) throws ObjectNotFoundException, IllegalArgumentException {
        attachmentValidator.checkAttachment(attachmentDto);
        Attachment updatedAttachment = attachmentConverter.convertAttachmentDtoToAttachment(attachmentDto);
        Attachment attachmentResponse = attachmentService.updateAttachmentById(id, updatedAttachment);
        return attachmentConverter.convertAttachmentToAttachmentDto(attachmentResponse);
    }

    @DeleteMapping("/{id}")
    public void deleteAttachmentById(@PathVariable String id) throws ObjectNotFoundException {
        attachmentService.deleteAttachmentById(id);
    }
}
