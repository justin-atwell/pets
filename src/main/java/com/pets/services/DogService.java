package com.pets.services;

import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public interface DogService {
    DogBreeds getAllBreeds() throws IOException;
    //String getAllBreeds();
    //Dog getAllBreeds() throws IOException;
    Dog getRandomImage() throws IOException;
}
