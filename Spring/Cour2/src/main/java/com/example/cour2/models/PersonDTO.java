package com.example.cour2.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
public class PersonDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private Integer age;


}
