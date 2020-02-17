package com.pets.services;

import com.pets.models.Dog;
import com.pets.repository.DogRepository;
import com.pets.repository.DogRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    private DogRepository repo = new DogRepositoryImpl();

    public Dog getAllBreeds() throws IOException {
        return repo.getAllBreeds();
    }
}
