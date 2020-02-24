package com.accounts.rules;

import com.accounts.exceptions.MissingAccountException;
import com.accounts.services.IRule;

import java.util.List;

public interface RulesCollector {
    List<IRule> getRulesForAccountName() throws MissingAccountException;
}

