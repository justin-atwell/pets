package com.pets.services;

import com.pets.models.Dog;
import com.pets.models.DogObjects;
import com.pets.repository.DogRepository;
import com.pets.repository.DogRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DogServiceImpl implements DogService {

    private DogRepository repo = new DogRepositoryImpl();

    public Dog getRandomImage() throws IOException {
        return repo.getRandomImage();
    }


}
