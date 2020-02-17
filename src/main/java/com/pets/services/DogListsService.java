package com.pets.services;

import com.pets.models.DogLists;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface DogListsService {
    DogLists getAllImages() throws IOException;
    DogLists getSomeImages(int number) throws IOException;
}
