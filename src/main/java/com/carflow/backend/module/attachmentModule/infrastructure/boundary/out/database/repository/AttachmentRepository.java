package com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.repository;

import com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity.AttachmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<AttachmentEntity,String> {
}
