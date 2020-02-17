package com.pets.services;

import com.pets.models.Dog;
import com.pets.models.DogBreeds;
import com.pets.models.DogImages;
import com.pets.repository.DogRepository;
import com.pets.repository.DogRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DogServiceImpl implements DogService {

    private DogRepository repo = new DogRepositoryImpl();

    public DogBreeds getAllBreeds() throws IOException {
        return repo.getAllBreeds();
    }

    public Dog getRandomImage() throws IOException {
        return repo.getRandomImage();
    }

    public DogImages getAllImages() throws IOException {
        return repo.getAllImages();
    }
}
