package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.customEnum.DamageType;
import com.carflow.backend.module.damageModule.domain.model.Damage;
import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.entity.DamageEntity;
import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.repository.DamageRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DamageRunner implements ApplicationRunner {
    private final DamageRepository damageRepository;

    public DamageRunner(DamageRepository damageRepository) {
        this.damageRepository = damageRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        DamageEntity damageEntity = new DamageEntity();
//        damageEntity.setId(1);
//        damageEntity.setDamageType(DamageType.OTHER);
//        damageEntity.setDescription("Opis tego co jest zniszczone.");
//        List<String> attachments = new ArrayList<>();
//        attachments.add("2");
//        damageEntity.setAttachmentIds(attachments);
//        damageRepository.save(damageEntity);
    }
}
