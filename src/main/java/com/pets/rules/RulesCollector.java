package com.pets.rules;

import com.pets.services.IRule;

import java.util.List;

public interface RulesCollector {
    List<IRule> getRulesForAccountName();
}

