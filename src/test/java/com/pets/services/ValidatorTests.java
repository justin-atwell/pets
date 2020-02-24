package com.pets.services;

import com.pets.rules.AccountRulesCollector;
import com.pets.rules.RulesCollector;
import org.apache.tomcat.util.digester.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ValidatorTests {

    @InjectMocks
    private Validator validator;

    @Mock
    private RulesCollector collector = new AccountRulesCollector();

    @Mock
    PetNameRules petNameRules = new PetNameRules();

    List<IRule> rules = new ArrayList<>();

    @Test
    public void validatePetsHappyPath() throws Exception {
        Pet pet = new Pet();
        pet.setName("Kevin");

        PetNameRules mockedRule = Mockito.mock(PetNameRules.class);
        rules.add(mockedRule);

        when(collector.getRulesForAccountName()).thenReturn(rules);
        when(rules.get(0).shouldRun(any())).thenReturn(false);

        List<String> result = validator.validatePets(pet);

        assertEquals(0, result.size());
    }

}
