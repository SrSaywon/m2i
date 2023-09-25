package com.example.pokeresttemplate.models;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class PokeDTO {

    public List<String> abilities = new ArrayList<>();

    public List<String> forms = new ArrayList<>();

    public List<String> types = new ArrayList<>();

    public int id;

    public List<String> sprites = new ArrayList<>();

    public int height;

    public int weight;

}
