package com.example.pokeresttemplate.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/poke")
public class PokeRestController {
    private final PokeService pokeService;


    @GetMapping("in-string")
    public List<String> getPokeInf() {
        getPokeInf().getPoke();
        return pokeService.getPokeInf();
    }
}
