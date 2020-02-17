package com.pets.services;

import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import com.pets.models.DogImages;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface DogService {
    DogBreeds getAllBreeds() throws IOException;
    //String getAllBreeds();
    //Dog getAllBreeds() throws IOException;
    Dog getRandomImage() throws IOException;

    DogImages getAllImages() throws IOException;
}
