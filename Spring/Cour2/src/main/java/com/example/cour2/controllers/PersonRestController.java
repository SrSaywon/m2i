package com.example.cour2.controllers;

import com.example.cour2.models.PersonDTO;
import com.example.cour2.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
@RequiredArgsConstructor
public class PersonRestController {
    private final PersonService personService;

    @GetMapping("list")
    public List<PersonDTO> listPersons() {
        return personService.getPersons();
    }
}
