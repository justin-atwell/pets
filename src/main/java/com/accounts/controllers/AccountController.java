package com.accounts.controllers;

import com.accounts.services.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path= "/accounts")
public class AccountController {

    @GetMapping(path="/")
    public List<Account> getAccounts() {
      List<Account> accounts = new ArrayList<>();
      Account account = new Account();
      account.setName("bill");

      accounts.add(account);

      return accounts;
    }
}
