package com.pets.repository;

import java.time.LocalDateTime;

public class HealthCheckRepositoryImpl implements HealthCheckRepository{

    public LocalDateTime healthCheckDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        return dateTime;
    }
}
