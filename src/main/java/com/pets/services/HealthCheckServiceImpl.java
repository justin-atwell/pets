package com.pets.services;

import com.pets.repository.HealthCheckRepository;

import java.time.LocalDateTime;

public class HealthCheckServiceImpl implements HealthCheckService{

    private HealthCheckRepository healthCheckRepository;

    public HealthCheckServiceImpl(HealthCheckRepository repository) {
        this.healthCheckRepository = repository;
    }

    public LocalDateTime getHealthCheckDate() {
        return healthCheckRepository.healthCheckDate();
    }
}
