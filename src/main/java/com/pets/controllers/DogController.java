package com.pets.controllers;

import com.pets.models.Dog;
import com.pets.services.DogService;
import com.pets.services.DogServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/dogs")
public class DogController {

    private DogService service = new DogServiceImpl();

    public DogController(DogService service) {
        this.service = service;
    }

    @GetMapping
    @RequestMapping("/random")
    public Dog getRandomImage() throws IOException {
        return service.getRandomImage();
    }


}
