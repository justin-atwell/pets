package com.pets.services;

import com.pets.repository.HealthCheckRepository;
import com.pets.repository.HealthCheckRepositoryImpl;

import java.time.LocalDateTime;

public class HealthCheckServiceImpl implements HealthCheckService{

    private HealthCheckRepository healthCheckRepository = new HealthCheckRepositoryImpl();

    public void setRepository(HealthCheckRepository repository) {

        this.healthCheckRepository = repository;
    }

    public HealthCheckServiceImpl (HealthCheckRepository healthCheckRepository) {
        healthCheckRepository = healthCheckRepository;
    }

    public LocalDateTime getHealthCheckDate() {

        return healthCheckRepository.getHealthCheckDate();
    }
}
