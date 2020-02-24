package com.accounts.services;

import com.accounts.exceptions.MissingAccountException;
import com.accounts.rules.AccountRulesCollector;
import com.accounts.rules.RulesCollector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ValidatorTests {

    @InjectMocks
    private Validator validator;

    @Mock
    private RulesCollector collector = new AccountRulesCollector();

    List<IRule> rules = new ArrayList<>();

    @Test
    public void validateAccountsHappyPath() throws MissingAccountException{
        Account account = new Account();
        account.setName("Kevin");

        AccountNameRules mockedRule = Mockito.mock(AccountNameRules.class);
        rules.add(mockedRule);

        when(collector.getRulesForAccountName()).thenReturn(rules);
        when(rules.get(0).shouldRun(any())).thenReturn(false);

        List<String> result = validator.validateAccounts(account);

        assertEquals(0, result.size());
    }

    @Test
    public void validateAccountsThrowsIfSomethingWentWrong() throws MissingAccountException{
        Account account = new Account();
        account.setName("whatever");
        MissingAccountException exception = new MissingAccountException();

        when(collector.getRulesForAccountName()).thenThrow(exception);

        List<String> result = validator.validateAccounts(account);

        assertThrows(MissingAccountException.class, () -> collector.getRulesForAccountName());
    }

    @Test
    public void validateAccountsThrowsMissingAcctExceptionWhenAccountIsMissing() throws MissingAccountException {
        when(collector.getRulesForAccountName()).thenThrow(new MissingAccountException());
        List<String> result = validator.validateAccounts(new Account());

        assertThrows(MissingAccountException.class, () -> collector.getRulesForAccountName());

    }
}
