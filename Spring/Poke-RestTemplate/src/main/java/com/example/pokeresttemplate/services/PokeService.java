package com.example.pokeresttemplate.services;

import com.example.pokeresttemplate.models.PokeDTO;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
@RequiredArgsConstructor
public class PokeService {

    private final RestTemplateBuilder builder;

    public PokeDTO getPokemon(String name) {
        RestTemplate restTemplate = builder.build();

        ResponseEntity<JsonNode> responseJson = restTemplate.getForEntity("pokemon/" + name, JsonNode.class);

        List<String> abilityNames = new ArrayList<>();
        List<String> typeNames = new ArrayList<>();
        List<String> formNames = new ArrayList<>();
        List<String> pokeImage = new ArrayList<>()

        String nameFound = responseJson.getBody().get("name").asText();

        responseJson.getBody().findPath("forms").elements()
                        .forEachRemaining(f -> {formNames.add(f.findPath("form").get("name").asText());
                        });

        responseJson.getBody().findPath("types").elements()
                        .forEachRemaining(t -> {typeNames.add(t.findPath("type").get("name").asText());
                        });

        responseJson.getBody().findPath("abilities").elements()
                .forEachRemaining(a -> {abilityNames.add(a.findPath("ability").get("name").asText());
                });

        String imageFound = responseJson.getBody().get("image").asText();

        responseJson.getBody().findPath("sprites").elements()
                .forEachRemaining(i-> {pokeImage.add(i.findPath("sprites").get("front_default").asText());
                });






        return PokeDTO
                .builder()
                .forms(formNames)
                .types(typeNames)
                .abilities(abilityNames)
                .sprites(pokeImage)
                .id()
                .height()
                .weight()
                .build();
    }
}