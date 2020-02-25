package com.accounts.services;

import com.accounts.exceptions.MissingAccountException;
import com.accounts.rules.RulesCollector;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private RulesCollector collector;

    public Validator(RulesCollector collector) {
        this.collector = collector;
    }

    public List<String> validateAccounts(Account account) {
        List<String> errors = new ArrayList<>();

        try {
            List<IRule> rulesForAccountName = collector.getRulesForAccountName();
            for (IRule rule : rulesForAccountName) {
                if (rule.shouldRun(account)) {
                    errors.addAll(rule.runRule(account));
                }
            }
        }
        catch(MissingAccountException maex)
        {

        } catch (NullPointerException nex) {

        }
        return errors;
    }
}
