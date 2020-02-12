package com.pets.services;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface DogService {
    ArrayList<String> getAllBreeds();
}
