package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.module.damageModule.infrastructure.boundary.out.database.repository.DamageRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class DamageRunner implements ApplicationRunner {
    private final DamageRepository damageRepository;

    public DamageRunner(DamageRepository damageRepository) {
        this.damageRepository = damageRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
