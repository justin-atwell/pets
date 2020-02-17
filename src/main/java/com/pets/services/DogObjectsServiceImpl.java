package com.pets.services;

import com.pets.models.DogObjects;
import com.pets.repository.DogObjectsRepository;
import com.pets.repository.DogObjectsRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DogObjectsServiceImpl implements DogObjectsService {

    private DogObjectsRepository repo = new DogObjectsRepositoryImpl();

    public DogObjects getAllBreeds() throws IOException {
        return repo.getAllBreeds();
    }
}
