package com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.helper;

import com.carflow.backend.module.attachmentModule.infrastructure.boundary.in.WebApi.v_0_0_1.model.AttachmentDto;
import org.springframework.stereotype.Service;

import static org.springframework.data.util.TypeUtils.type;

@Service
public class AttachmentValidator {
    public void checkAttachment(AttachmentDto attachmentDto) throws IllegalArgumentException {

        if (attachmentDto.getId() <= 0) {
            throw new IllegalArgumentException("The identifier value must be a positive value.");
        }
    }
}
