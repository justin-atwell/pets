package com.pets.configuration;

//import Repo interface
//import Repo Impl
//import Service interface
//import Service Impl

import com.pets.repository.HealthCheckRepository;
import com.pets.repository.HealthCheckRepositoryImpl;
import com.pets.services.HealthCheckService;
import com.pets.services.HealthCheckServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HealthCheckService healthCheckService() {
        return new HealthCheckServiceImpl(repository());
    }

    @Bean
    public HealthCheckRepository repository() {
        return new HealthCheckRepositoryImpl();
    }
}
