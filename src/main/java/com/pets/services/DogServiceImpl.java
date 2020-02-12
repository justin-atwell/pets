package com.pets.services;

import com.pets.repository.DogRepository;
import com.pets.repository.DogRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DogServiceImpl implements DogService {

    private DogRepository repo = new DogRepositoryImpl();

    public ArrayList<String> getAllBreeds() {
        return repo.getAllBreeds();
    }
}
