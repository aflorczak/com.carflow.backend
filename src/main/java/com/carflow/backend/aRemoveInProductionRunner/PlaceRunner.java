package com.carflow.backend.aRemoveInProductionRunner;

import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.entity.PlaceEntity;
import com.carflow.backend.module.placeModule.infrastructure.boundary.out.database.repository.PlaceRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class PlaceRunner implements ApplicationRunner {
    private final PlaceRepository placeRepository;

    public PlaceRunner(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        PlaceEntity firstPlace = new PlaceEntity();
        PlaceEntity secondPlace = new PlaceEntity();
        firstPlace.setId(1);
        secondPlace.setId(2);
        firstPlace.setStreet("ul. Wymyslona");
        secondPlace.setStreet("ul. Inna");
        firstPlace.setBuildingNumber("12");
        secondPlace.setBuildingNumber("18");
        firstPlace.setApartmentNumber("1");
        secondPlace.setApartmentNumber("1");
        firstPlace.setPostCode("69-325");
        secondPlace.setPostCode("47-326");
        firstPlace.setCity("Innomiascowe");
        secondPlace.setCity("Swornegacie");
        firstPlace.setCountry("Polska");
        secondPlace.setCountry("Polska");
        placeRepository.save(firstPlace);
        placeRepository.save(secondPlace);
    }
}
