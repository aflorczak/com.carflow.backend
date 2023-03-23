package com.carflow.backend.infrastructure.boundaries.out.attachment.repository;

import com.carflow.backend.infrastructure.boundaries.out.attachment.entity.AttachmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<AttachmentEntity,String> {
}
