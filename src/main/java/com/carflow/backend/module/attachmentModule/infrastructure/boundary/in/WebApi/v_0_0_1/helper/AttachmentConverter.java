package com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.helper;

import com.carflow.backend.module.attachmentModule.domain.model.Attachment;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.model.AttachmentDto;
import org.springframework.stereotype.Service;

@Service
public class AttachmentConverter {
    public Attachment convertAttachmentDtoToAttachment(AttachmentDto attachmentDto) {
        Attachment attachment = new Attachment();
        attachment.setId(attachmentDto.getId());
        attachment.setArchived(attachmentDto.getArchived());
        attachment.setName(attachmentDto.getName());
        attachment.setDescription(attachmentDto.getDescription());
        attachment.setUrl(attachmentDto.getUrl());
        return attachment;
    }

    public AttachmentDto convertAttachmentToAttachmentDto(Attachment attachment) {
        AttachmentDto attachmentDto = new AttachmentDto();
        attachmentDto.setId(attachment.getId());
        attachmentDto.setArchived(attachment.getArchived());
        attachmentDto.setName(attachment.getName());
        attachmentDto.setDescription(attachment.getDescription());
        attachmentDto.setUrl(attachment.getUrl());
        return attachmentDto;
    }
}
