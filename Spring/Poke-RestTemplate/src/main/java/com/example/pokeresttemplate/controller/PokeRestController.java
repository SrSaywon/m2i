package com.example.pokeresttemplate.controller;


import com.example.pokeresttemplate.models.PokeDTO;
import com.example.pokeresttemplate.services.PokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/poke")
public class PokeRestController {
    private final PokeService pokeService;


    @GetMapping("pokemon/{pokeName}")
    public PokeDTO getPokebyName (@PathVariable String pokeName){
        return pokeService.getPokemon(pokeName);
    }
}
