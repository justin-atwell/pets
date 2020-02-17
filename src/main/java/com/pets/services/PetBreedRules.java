package com.pets.services;

import java.util.List;

public class PetBreedRules implements IRule {

    public boolean shouldRun(Pet pet) {
        return pet.getBreed() == "Golden Retriever";
    }

    public List runRule(Pet pet) {
        return null;
    }
}
