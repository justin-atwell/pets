package com.pets.controllers;

import com.pets.views.PetView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PetController {
    @RequestMapping(value = "/pets", method = RequestMethod.GET)
    public List<PetView> getAllPets() {
        return new ArrayList<PetView>();
    }
}
