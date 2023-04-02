package com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.service;

import com.carflow.backend.exception.ObjectNotFoundException;
import com.carflow.backend.module.attachmentModule.domain.interfaces.AttachmentStorage;
import com.carflow.backend.module.attachmentModule.domain.model.Attachment;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.helper.AttachmentEntityConverter;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.repository.AttachmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SQLAttachmentStorage implements AttachmentStorage {
    private final AttachmentRepository attachmentRepository;
    private final AttachmentEntityConverter converter;

    public SQLAttachmentStorage(
            AttachmentRepository attachmentRepository,
            AttachmentEntityConverter converter
    ) {
        this.attachmentRepository = attachmentRepository;
        this.converter = converter;
    }

    @Override
    public Attachment createNewAttachment(Attachment attachment) {
        return converter.convertAttachmentEntityToAttachment(attachmentRepository.save(converter.convertAttachmentToAttachmentEntity(attachment)));
    }

    @Override
    public List<Attachment> getAllAttachments() {
        return attachmentRepository.findAll().stream().map(converter::convertAttachmentEntityToAttachment).toList();
    }

    @Override
    public Attachment getAttachmentById(String id) throws ObjectNotFoundException {
        Optional<AttachmentEntity> attachment = attachmentRepository.findById(id);
        if (attachment.isPresent()) {
            return converter.convertAttachmentEntityToAttachment(attachment.get());
        } else {
            throw new ObjectNotFoundException("Object not found.");
        }
    }

    @Override
    public Attachment updateAttachmentById(String id, Attachment updatedAttachment) throws ObjectNotFoundException {
       if (attachmentRepository.existsById(id)) {
           AttachmentEntity attachmentEntity = attachmentRepository.save(converter.convertAttachmentToAttachmentEntity(updatedAttachment));
           return converter.convertAttachmentEntityToAttachment(attachmentEntity);
       } else {
           throw new ObjectNotFoundException("Object not found.");
       }
    }

    @Override
    public void deleteAttachmentById(String id) throws ObjectNotFoundException {
        Optional<AttachmentEntity> attachment = attachmentRepository.findById(id);
        if (attachment.isPresent()) {
            attachmentRepository.deleteById(id);
        } else {
            throw new ObjectNotFoundException("Object not found");
        }
    }
}
