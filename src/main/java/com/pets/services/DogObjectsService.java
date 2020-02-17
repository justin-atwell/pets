package com.pets.services;

import com.pets.models.DogObjects;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface DogObjectsService {

    DogObjects getAllBreeds() throws IOException;
}
