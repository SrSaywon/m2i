package com.example.exercicepath.models;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;


@Data
@Builder
public class CarDTO {
    private UUID id;
    private String brand;
    private String color;
    private Integer year;
}
