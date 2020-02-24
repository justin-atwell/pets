package com.accounts.rules;

import com.accounts.services.IRule;
import com.accounts.services.AccountNameRules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountRulesCollector implements RulesCollector {

    public List<IRule> getRulesForAccountName() {
        return new ArrayList<IRule>(Collections.singleton(new AccountNameRules()));
    }
}
