package com.pets.services;

import com.pets.models.Dog;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface DogService {
    Dog getRandomImage() throws IOException;
}
