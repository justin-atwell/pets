package com.pets.controllers;

import com.pets.models.DogObjects;
import com.pets.services.DogObjectsService;
import com.pets.services.DogObjectsServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/objects")
public class DogObjectsController {

    private DogObjectsService service = new DogObjectsServiceImpl();

    public DogObjectsController(DogObjectsService service) {
        this.service = service;
    }

    @GetMapping
    public DogObjects getAllBreeds() throws IOException {
        return service.getAllBreeds();
    }
}
