package com.example.exercicepath.controllers;

import com.example.exercicepath.models.CarDTO;
import com.example.exercicepath.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @GetMapping("list")
    public String listCars(Model model) {
        model.addAttribute("cars", carService.getCars());

        return "carListing";
    }

    //public String getCarDetails(@PathVariable UUID carId)


    public String getCarById (Model model) {
        List<CarDTO> cars = carService.getCars();
        model.addAttribute("cars", cars);

        for (CarDTO c : cars) {
            model.addAttribute("id", c.getId());
            model.addAttribute("brand", c.getBrand());
            model.addAttribute("color", c.getColor());
            model.addAttribute("year", c.getYear());
        }

        return "carListing";
    }



}
