package com.example.exercice2.services;

import com.example.exercice2.models.ContactDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Primary
public class ContactService {
    private final Map<UUID, ContactDTO> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();

        ContactDTO contactA = ContactDTO.builder()
                .id(UUID.randomUUID())
                .firstName("Jean")
                .lastName("Dujardin")
                .age(54)
                .phoneNumber("06.42.58.63.96")
                .build();

        ContactDTO contactB = ContactDTO.builder()
                .id(UUID.randomUUID())
                .firstName("Pierre")
                .lastName("Niney")
                .age(34)
                .phoneNumber("07.56.75.82.38")
                .build();

        ContactDTO contactC = ContactDTO.builder()
                .id(UUID.randomUUID())
                .firstName("David")
                .lastName("Marsais")
                .age(36)
                .phoneNumber("06.25.64.96.35")
                .build();

        ContactDTO contactD = ContactDTO.builder()
                .id(UUID.randomUUID())
                .firstName("Grégoire")
                .lastName("Ludig")
                .age(37)
                .phoneNumber("07.52.64.89.21")
                .build();

        contacts.put(contactA.getId(), contactA);
        contacts.put(contactB.getId(), contactB);
        contacts.put(contactC.getId(), contactC);
        contacts.put(contactD.getId(), contactD);
    }

    public List<ContactDTO> getContacts() {
        return contacts.values().stream().toList();
    }

    public Optional<ContactDTO> getContactById(UUID id) {
        return contacts.values().stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public ContactDTO addContact(ContactDTO contactData) {
        if (contactData.getId()==null) {
            contactData.setId(UUID.randomUUID());
        }

        contacts.put(contactData.getId(), contactData);

        return contactData;
    }
}
