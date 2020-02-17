package com.pets.repository;

import com.pets.models.Dog;
import com.pets.models.DogObjects;
import com.pets.models.DogLists;

import java.io.IOException;

public interface DogRepository {

    Dog getRandomImage() throws IOException;

}
