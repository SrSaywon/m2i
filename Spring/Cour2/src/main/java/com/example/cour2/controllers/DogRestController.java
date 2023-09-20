package com.example.cour2.controllers;

import com.example.cour2.models.DogDTO;
import com.example.cour2.services.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/dogs")
@RequiredArgsConstructor
public class DogRestController {
    private final DogService dogService;

    @GetMapping("list")
    public List<DogDTO> listDogs() {
        return dogService.getDogs();
    }

    @GetMapping("details/{dogId}")
    public ResponseEntity<DogDTO> getDogById(@PathVariable("dogId")UUID id) {
        DogDTO found = dogService.getDogById(id);

        if (found != null) {
            return ResponseEntity.ok(found);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
