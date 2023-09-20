package com.example.cour2.services;

import com.example.cour2.models.PersonDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Primary
public class PersonService {
    private final Map<UUID, PersonDTO> persons;

    public PersonService() {
        persons = new HashMap<>();

        PersonDTO personA = PersonDTO.builder()
                .id(UUID.randomUUID())
                .firstName("Jean")
                .lastName("Amond")
                .age(45)
                .build();

        PersonDTO personB = PersonDTO.builder()
                .id(UUID.randomUUID())
                .firstName("Marie")
                .lastName("Palo")
                .age(32)
                .build();

        PersonDTO personC = PersonDTO.builder()
                .id(UUID.randomUUID())
                .firstName("Francois")
                .lastName("Mittraillette")
                .age(62)
                .build();

        persons.put(personA.getId(), personA);
        persons.put(personB.getId(), personB);
        persons.put(personC.getId(), personC);
    }

    public List<PersonDTO> getPersons() {
        return persons.values().stream().toList();

    }

    public Optional<PersonDTO> getPersonById(UUID id) {
        return persons.values().stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public PersonDTO getPersonByIdBis(UUID id) {
        return persons.values().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst().orElse(null);
    }
}
