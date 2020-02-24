package com.pets.services;

import com.pets.rules.RulesCollector;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private RulesCollector collector;

    public Validator(RulesCollector collector) {
        this.collector = collector;
    }

    public List<String> validatePets(Pet pet) {

        List<String> errors = new ArrayList<>();

        for (IRule rule : collector.getRulesForAccountName()) {
            if (rule.shouldRun(pet)){
                errors.addAll(rule.runRule(pet));
            }
        }

        return errors;
    }
}
