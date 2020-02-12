package com.pets.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pets.services.HealthCheckService;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/healthCheck")
public class HealthCheckController {

    private HealthCheckService service;

    public HealthCheckController(HealthCheckService service) {
        this.service = service;
    }

    @GetMapping()
    public LocalDateTime healthCheck() {
        return service.getHealthCheckDate();
    }
}
