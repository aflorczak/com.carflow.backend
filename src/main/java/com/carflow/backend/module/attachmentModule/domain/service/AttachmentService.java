package com.carflow.backend.module.attachmentModule.domain.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.attachmentModule.domain.interfaces.AttachmentStorage;
import com.carflow.backend.module.attachmentModule.domain.model.Attachment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentService {
    private final AttachmentStorage storage;

    public AttachmentService(AttachmentStorage storage) {
        this.storage = storage;
    }

    public Attachment createNewAttachment(Attachment attachment) {
        return storage.createNewAttachment(attachment);
    }

    public List<Attachment> getAllAttachments() {
        return storage.getAllAttachments();
    }

    public Attachment getAttachmentById(String id) throws ObjectNotFoundException {
        return storage.getAttachmentById(id);
    }
    public Attachment updateAttachmentById(String id, Attachment attachment) throws ObjectNotFoundException {
        return storage.updateAttachmentById(id, attachment);
    }

    public void deleteAttachmentById(String id) throws ObjectNotFoundException {
        storage.deleteAttachmentById(id);
    }

}
