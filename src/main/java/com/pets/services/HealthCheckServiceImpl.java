package com.pets.services;

import com.pets.repository.HealthCheckRepository;

import java.util.Date;

public class HealthCheckServiceImpl implements HealthCheckService{

    private HealthCheckRepository healthCheckRepository;

    public HealthCheckServiceImpl(HealthCheckRepository repository) {
        this.healthCheckRepository = repository;
    }

    public Date getHealthCheckDate() {
        return healthCheckRepository.healthCheckDate();
    }
}
