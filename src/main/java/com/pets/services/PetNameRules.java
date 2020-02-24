package com.pets.services;

import java.util.ArrayList;
import java.util.List;

public class PetNameRules implements IRule {

    public boolean shouldRun(Pet pet) {
        return false;
    }

    public List runRule(Pet pet) {
        List<String> errors = new ArrayList<>();

        if(pet.getName() == "Mark Wahlberg") {
            System.out.println("yay, no rules broken!");
        }

        else {
            errors.add("Rest In Pepperoni, Rule Failed Checking Pet Name");
        }

        return errors;
    }
}

