package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.repository.AttachmentRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class AttachmentRunner implements ApplicationRunner {
    private final AttachmentRepository attachmentRepository;


    public AttachmentRunner(AttachmentRepository attachmentRepository) {
        this.attachmentRepository = attachmentRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        AttachmentEntity attachment = new AttachmentEntity();
//        AttachmentEntity attachment1 = new AttachmentEntity();
//        attachment.setId(1);
//        attachment.setId(2);
//        attachment.setName("Umowa wynajmu nr 18/04/2023");
//        attachment1.setName("Regulamin do umowy wynajmu nr 18/04/2023");
//        attachment.setDescription(null);
//        attachment.setDescription(null);
//        attachment.setUrl(null);
//        attachment.setUrl(null);
//        attachmentRepository.save(attachment);
//        attachmentRepository.save(attachment1);
    }
}
