package com.example.pokeresttemplate.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PokeDTO {

    public List<AbilityDTO> abilities;

    public List<FromDTO> forms;

    public List<TypeDTO> types;

    public int id;

    public List<SpriteDTO> sprites;

    public int height;

    public int weight;

}
