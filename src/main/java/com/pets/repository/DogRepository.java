package com.pets.repository;

import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import com.pets.models.DogLists;

import java.io.IOException;

public interface DogRepository {
    DogBreeds getAllBreeds() throws IOException;
    Dog getRandomImage() throws IOException;
    DogLists getAllImages() throws IOException;
}
