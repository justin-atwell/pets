package com.pets.repository;

import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import com.pets.models.DogImages;

import java.io.IOException;

public interface DogRepository {
    DogBreeds getAllBreeds() throws IOException;
    Dog getRandomImage() throws IOException;
    DogImages getAllImages() throws IOException;
}
