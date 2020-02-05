package com.pets.repository;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository("healthCheckRepository")
public class HealthCheckRepositoryImpl implements HealthCheckRepository{

    public LocalDateTime getHealthCheckDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        return dateTime;
    }
}
