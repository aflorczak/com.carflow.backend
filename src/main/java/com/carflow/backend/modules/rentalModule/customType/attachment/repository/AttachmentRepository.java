package com.carflow.backend.modules.rentalModule.customType.attachment.repository;

import com.carflow.backend.modules.rentalModule.customType.attachment.entity.AttachmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<AttachmentEntity,String> {
}
