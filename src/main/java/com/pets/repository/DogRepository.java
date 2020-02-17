package com.pets.repository;

import com.pets.models.Breed;
import com.pets.models.Dog;
import com.pets.models.DogBreeds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface DogRepository {
    DogBreeds getAllBreeds() throws IOException;
    //List<Dog> getAllBreeds() throws IOException;
    //Dog getAllBreeds() throws IOException;
    Dog getRandomImage() throws IOException;
}
