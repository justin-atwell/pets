package com.pets.services;

import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import com.pets.models.DogLists;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface DogService {
    DogBreeds getAllBreeds() throws IOException;
    //String getAllBreeds();
    //Dog getAllBreeds() throws IOException;
    Dog getRandomImage() throws IOException;

    DogLists getAllImages() throws IOException;
    DogLists getSomeImages(int number) throws IOException;
}
