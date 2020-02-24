package com.pets.rules;

import com.pets.services.IRule;
import com.pets.services.PetNameRules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountRulesCollector implements RulesCollector {

    public List<IRule> getRulesForAccountName() {
        return new ArrayList<IRule>(Collections.singleton(new PetNameRules()));
    }
}
