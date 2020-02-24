package com.accounts.services;

import java.util.List;

public class AccountTypeRules implements IRule {

    public boolean shouldRun(Account account) {
        return false;
    }

    public List runRule(Account account) {
        return null;
    }
}
