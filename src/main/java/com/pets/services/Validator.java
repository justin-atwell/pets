package com.pets.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Validator {
    private final List<IRule> rules;

    public Validator() {
        rules = Collections.unmodifiableList(Arrays.asList(new PetNameRules(), new PetBreedRules()));
    }

    public List<String> validatePets(Pet pet) {

        List<String> errors = new ArrayList<>();

        for (IRule rule : rules) {
            if (rule.shouldRun(pet)){
                errors.addAll(rule.runRule(pet));
            }
        }

        return errors;
    }
}
