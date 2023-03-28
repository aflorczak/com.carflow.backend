package com.carflow.backend.module.attachmentModule.domain.interfaces;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.attachmentModule.domain.model.Attachment;

import java.util.List;

public interface AttachmentStorage {
    Attachment createNewAttachment(Attachment attachment);
    List<Attachment> getAllAttachments();
    Attachment getAttachmentById(String id) throws ObjectNotFoundException;
    Attachment updateAttachmentById(String id, Attachment updatedAttachment) throws ObjectNotFoundException;
    void deleteAttachmentById(String id) throws ObjectNotFoundException;
}
