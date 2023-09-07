package com.example.exo3;

public class AnimalsObject {

    private String type;

    private String espece;

    private Integer age;

    private String name;

    private String color;

    public AnimalsObject(String type, String espece, Integer age, String name, String color) {
        this.type = type;
        this.espece = espece;
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AnimalsObject{" +
                "type='" + type + '\'' +
                ", espece='" + espece + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
