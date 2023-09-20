package com.example.cour3.services;

import com.example.cour3.models.DogsDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Primary
public class DogService {

    private final  Map<UUID, DogsDTO> dogs;





    DogsDTO dogA = DogsDTO.builder()
            .id(UUID.randomUUID())
            .name("Twixy")
            .breed("Border")
            .age(1)
            .build();

    DogsDTO dogB = DogsDTO.builder()
            .id(UUID.randomUUID())
            .name("Rex")
            .breed("BullD")
            .age(3)
            .build();

    DogsDTO dogC = DogsDTO.builder()
            .id(UUID.randomUUID())
            .name("Barbara")
            .breed("chiwawa")
            .age(6)
            .build();
}
