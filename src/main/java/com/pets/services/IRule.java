package com.pets.services;

import java.util.List;

public interface IRule {
    boolean shouldRun(Pet pet);
    List runRule(Pet pet);
}

