package com.pets.repository;

import com.pets.models.DogObjects;

import java.io.IOException;

public interface DogObjectsRepository {
    DogObjects getAllBreeds() throws IOException;
}
