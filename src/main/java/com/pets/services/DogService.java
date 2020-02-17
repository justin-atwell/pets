package com.pets.services;

import com.pets.models.Dog;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public interface DogService {
    //ArrayList<String> getAllBreeds();
    //String getAllBreeds();
    Dog getAllBreeds() throws IOException;
}
