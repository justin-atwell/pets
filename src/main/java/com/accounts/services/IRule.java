package com.accounts.services;

import com.accounts.exceptions.MissingAccountException;

import java.util.List;

public interface IRule {
    boolean shouldRun(Account account) throws MissingAccountException;
    List runRule(Account account);
}

