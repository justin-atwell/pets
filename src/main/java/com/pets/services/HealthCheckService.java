package com.pets.services;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface HealthCheckService {

    Date getHealthCheckDate();
}
