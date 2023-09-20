package com.example.exercicepath.services;

import com.example.exercicepath.models.CarDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Primary
public class CarService {
    private final Map<UUID, CarDTO> cars;

    public CarService() {
        cars = new HashMap<>();

        CarDTO carA =CarDTO.builder()
                .id(UUID.randomUUID())
                .brand("Peaugeot")
                .color("Vert")
                .year(1996)
                .build();

        CarDTO carB =CarDTO.builder()
                .id(UUID.randomUUID())
                .brand("Tesla")
                .color("Blanche")
                .year(2017)
                .build();

        CarDTO carC =CarDTO.builder()
                .id(UUID.randomUUID())
                .brand("Kia")
                .color("Rouge")
                .year(2018)
                .build();

        CarDTO carD =CarDTO.builder()
                .id(UUID.randomUUID())
                .brand("Opel")
                .color("Bleu")
                .year(2023)
                .build();

        cars.put(carA.getId(), carA);
        cars.put(carB.getId(), carB);
        cars.put(carC.getId(), carC);
        cars.put(carD.getId(), carD);
    }

    public List<CarDTO> getCars() {
        return cars.values().stream().toList();
    }

    public CarDTO getCarById(UUID id) {
        return cars.values().stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }
}
