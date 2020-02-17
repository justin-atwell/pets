package com.pets.repository;

import com.pets.models.Breed;
import com.pets.models.Dog;

import java.io.IOException;
import java.util.List;

public interface DogRepository {
    //ArrayList<String> getAllBreeds();
    //List<Dog> getAllBreeds() throws IOException;
    Dog getAllBreeds() throws IOException;
}
