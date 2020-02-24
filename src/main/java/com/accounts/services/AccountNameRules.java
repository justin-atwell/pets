package com.accounts.services;

import com.accounts.exceptions.MissingAccountException;

import java.util.ArrayList;
import java.util.List;

public class AccountNameRules implements IRule {

    public boolean shouldRun(Account account) throws MissingAccountException {
        try {
            return account.getName() == "whatever";
        }
        catch(Exception ex) {
            if(account.getName() == null)
            {
                throw new MissingAccountException();
            }
            return false;
        }
    }

    public List runRule(Account account) {
        List<String> errors = new ArrayList<>();

        if(account.getName() == "Mark Wahlberg") {
            System.out.println("yay, no rules broken!");
        }

        else {
            errors.add("Rest In Pepperoni, Rule Failed Checking Pet Name");
        }

        return errors;
    }
}

