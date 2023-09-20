package com.example.cour2.services;

import com.example.cour2.models.DogDTO;
import com.example.cour2.models.PersonDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Primary
public class DogService {
    private final Map<UUID, DogDTO> dogs;


    public  DogService() {
        dogs = new HashMap<>();

    DogDTO dogA = DogDTO.builder()
                .id(UUID.randomUUID())
                .name("plutot")
                .breed("BovierB")
                .age(8)
                .build();

    DogDTO dogB = DogDTO.builder()
            .id(UUID.randomUUID())
            .name("Twixy")
            .breed("BorderC")
            .age(1)
            .build();

    DogDTO dogC = DogDTO.builder()
            .id(UUID.randomUUID())
            .name("Brutus")
            .breed("PitB")
            .age(4)
            .build();

    }

    public List<DogDTO> getDogs() {
        return dogs.values().stream().toList();
    }

    public DogDTO getDogById(UUID id) {
        return dogs.values().stream()
                .filter(d -> d.getId().equals(id))
                .findFirst().orElse(null);

    }
}
