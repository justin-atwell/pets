package com.pets.controllers;

import com.pets.models.DogLists;
import com.pets.services.DogListsService;
import com.pets.services.DogListsServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/lists")
public class DogListsController {

    private DogListsService service = new DogListsServiceImpl();
    public DogListsController(DogListsService service) {
        this.service = service;
    }

    @GetMapping
    @RequestMapping("/images")
    public DogLists getAllImages() throws IOException {
        return service.getAllImages();
    }

    @GetMapping
    @RequestMapping("/images/{number}")
    public DogLists getSomeImages(@PathVariable("number") int number) throws IOException {
        return service.getSomeImages(number);
    }
}
