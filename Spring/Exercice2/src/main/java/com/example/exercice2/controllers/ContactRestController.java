package com.example.exercice2.controllers;

import com.example.exercice2.exeptions.RessourceNotFound;
import com.example.exercice2.models.ContactDTO;
import com.example.exercice2.services.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/contacts")
@RequiredArgsConstructor
@Slf4j
public class ContactRestController {
    private final ContactService contactService;


    @GetMapping
    public List<ContactDTO> listContacts(@RequestParam(value = "firstName", defaultValue = "") String filterByFirstName) {
        List<ContactDTO> contacts = contactService.getContacts();

        log.debug("GET to /contacts/contactList");

        if (!filterByFirstName.isEmpty() && !filterByFirstName.isBlank()) {
            contacts = contacts.stream().filter(c -> c.getFirstName().startsWith(filterByFirstName)).toList();
        }

        return contacts;
    }

    @GetMapping("/{contactId}")
    public ContactDTO getDetails(@PathVariable("contactId")UUID id) {
        Optional<ContactDTO> foundContact = contactService.getContactById(id);

        if (foundContact.isEmpty()) {
            return foundContact.get();
        }

        throw new RessourceNotFound();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addContactHandler(@RequestBody ContactDTO newContact) {
        ContactDTO createdContact = contactService.addContact(newContact);

        return new ResponseEntity<String>("contact created! New id: " + createdContact.getId(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{contactId}")
    public ResponseEntity<String> deleteContactHandler(@PathVariable("contactId")UUID id) {
        Optional<ContactDTO> foundContact = contactService.getContactById(id);

        if (foundContact.isPresent()) {
            if (contactService.deleteContactById(id)) {
                return new ResponseEntity<String>("Contact is deleted at id: " + id, HttpStatus.OK);
            }
            return new ResponseEntity<String>("Something went wrong...", HttpStatus.NOT_MODIFIED);

        }else {
            throw new RessourceNotFound();
        }
    }

    @PatchMapping("/{contactId}")
    public ContactDTO editContact(@PathVariable("contactId") UUID id, @RequestBody ContactDTO contactData) {
        Optional<ContactDTO> foundContact = contactService.getContactById(id);

        if (foundContact.isPresent()) {
            return  contactService.editContact(id, contactData);
        }else {
            throw new RessourceNotFound();
        }
    }
}
