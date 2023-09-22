package com.example.exercice2.controllers;

import com.example.exercice2.exeptions.RessourceNotFound;
import com.example.exercice2.models.ContactDTO;
import com.example.exercice2.services.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/contacts")
@RequiredArgsConstructor
@Slf4j
public class ContactController {

    private final ContactService contactService;

    @GetMapping
    public String listContacts(Model model, @RequestParam(value = "firstName", defaultValue = "") String filterByFirstName) {
        List<ContactDTO> contacts = contactService.getContacts();

        log.debug("GET to /contacts/contactList");

        if (!filterByFirstName.isEmpty() && !filterByFirstName.isBlank()) {
            contacts = contacts.stream().filter(c -> c.getLastName().startsWith(filterByFirstName)).toList();
        }

        model.addAttribute("contacts", contacts);

        return "contact/contactList";
    }

    @GetMapping("/{contactId}")
    public String getContactDetails(@PathVariable("contactId")UUID id, Model model) {
        Optional<ContactDTO> foundContact = contactService.getContactById(id);

        if (foundContact.isPresent()) {
            model.addAttribute("contact", foundContact.get());
            model.addAttribute("mode", "details");

            return "contact/contactForm";
        }

        throw new RessourceNotFound();
    }

    @GetMapping("/add")
    public String contactForm(Model model, @RequestParam(value = "exemple", defaultValue = "default")String blabla) {
        log.debug("blabla" + blabla);

        model.addAttribute("contact", ContactDTO.builder().build());
        model.addAttribute("mode", "add");

        return "contact/contactForm";
    }

//    @GetMapping("/delete/{contactId}")
//    public String contactDelete(@PathVariable("contactId")UUID id, Model model) {
//        Optional<ContactDTO> foundContact = contactService.getContactById(id);
//
//        if (foundContact.isPresent()){
//            model.addAttribute("contact", foundContact.get());
//            model.addAttribute("mode", "delete");
//
//            return "contact/contactList";
//        }
//
//        throw new RessourceNotFound();
//
//    }

    @PostMapping("/add")
    public String addContactHandler (ContactDTO newContact) {
        contactService.addContact(newContact);

        return "redirect:/contacts";
    }

    @PostMapping("/delete/{contactId}")
    public String deleteContactById(@PathVariable("contactId") UUID id) {

        return "redirect:/contacts";
    }

}
