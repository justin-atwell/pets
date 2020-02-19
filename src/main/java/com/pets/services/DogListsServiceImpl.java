package com.pets.services;

import com.pets.models.Dog;
import com.pets.models.DogLists;
import com.pets.repository.DogListsRepository;
import com.pets.repository.DogListsRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DogListsServiceImpl implements DogListsService {

    private DogListsRepository repo = new DogListsRepositoryImpl();

    public DogLists getAllImages() throws IOException {
        return repo.getAllImages();
    }

    public DogLists getSomeImages(int number) throws IOException {
        return repo.getSomeImages(number);
    }

    public DogLists getImagesByBreed(String breed) throws IOException {
        return repo.getImagesByBreed(breed);
    }
}
