package com.example.exo3;

import java.time.LocalDate;

public class CatObject {

    private String name;

    private String breed;

    private String color;

    private LocalDate dateOfBirth;

    public CatObject(String name, String breed, String color, LocalDate dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "CatObject{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
