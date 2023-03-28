package com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.helper;

import com.carflow.backend.module.attachmentModule.domain.model.Attachment;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import org.springframework.stereotype.Service;

@Service
public class AttachmentEntityConverter {
    public AttachmentEntity convertAttachmentToAttachmentEntity(Attachment attachment) {
        return new AttachmentEntity(
                attachment.getId(),
                attachment.getName(),
                attachment.getDescription(),
                attachment.getUrl()
        );
    }

    public Attachment convertAttachmentEntityToAttachment(AttachmentEntity attachmentEntity) {
        return new Attachment(
                attachmentEntity.getId(),
                attachmentEntity.getName(),
                attachmentEntity.getDescription(),
                attachmentEntity.getUrl()
        );
    }
}
