package com.example.exercice2.models;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ContactDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String phoneNumber;
}
