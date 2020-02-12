package com.pets.repository;

import java.time.LocalDateTime;


public interface HealthCheckRepository {
    LocalDateTime getHealthCheckDate();
}
