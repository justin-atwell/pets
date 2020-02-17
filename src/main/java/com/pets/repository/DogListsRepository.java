package com.pets.repository;


import com.pets.models.DogLists;

import java.io.IOException;

public interface DogListsRepository {
    DogLists getAllImages() throws IOException;
    DogLists getSomeImages(int number) throws IOException;
}
