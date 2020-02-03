package com.pets.services;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public interface HealthCheckService {

    LocalDateTime getHealthCheckDate();
}
