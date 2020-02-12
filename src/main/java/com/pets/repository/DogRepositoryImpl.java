package com.pets.repository;

import java.util.ArrayList;

public class DogRepositoryImpl implements DogRepository{

    public ArrayList<String> getAllBreeds() {
        ArrayList<String> breeds = new ArrayList<String>();
        breeds.add("English Bulldog");
        breeds.add("Some other dog");
        breeds.add("Third dog");
        return breeds;
    }
}
