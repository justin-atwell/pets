package com.pets.configuration;

import com.pets.repository.HealthCheckRepository;
import com.pets.repository.HealthCheckRepositoryImpl;
import com.pets.services.HealthCheckService;
import com.pets.services.HealthCheckServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "healthCheckService")
    public HealthCheckService getHealthCheckService() {

        //return new HealthCheckServiceImpl();
        HealthCheckServiceImpl service = new HealthCheckServiceImpl(getHealthCheckRepository());
        //service.setRepository(getHealthCheckRepository());
        return service;
    }

    @Bean(name = "healthCheckRepository")
    public HealthCheckRepository getHealthCheckRepository() {

        return new HealthCheckRepositoryImpl();
    }
}
