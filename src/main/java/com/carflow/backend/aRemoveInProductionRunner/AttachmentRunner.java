package com.carflow.backend.aRemoveInProductionRunner;

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

    }
}
