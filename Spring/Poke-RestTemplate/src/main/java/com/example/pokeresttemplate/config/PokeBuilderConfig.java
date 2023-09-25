package com.example.pokeresttemplate.config;

import lombok.Value;
import org.springframework.boot.autoconfigure.web.client.RestTemplateBuilderConfigurer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class PokeBuilderConfig {
    @Value("https://pokeapi.co")
    private String rootUrl;

    @Bean
    RestTemplateBuilder restTemplateBuilder(RestTemplateBuilderConfigurer configurer) {
        RestTemplateBuilder builder = configurer.configure(new RestTemplateBuilder());

        DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(rootUrl);

        RestTemplateBuilder configuredBuilder = builder.uriTemplateHandler(uriBuilderFactory);

        return configuredBuilder;
    }
}
