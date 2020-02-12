package com.pets.configuration;

import com.pets.repository.HealthCheckRepository;
import com.pets.repository.HealthCheckRepositoryImpl;
import com.pets.services.HealthCheckService;
import com.pets.services.HealthCheckServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pets"})
public class AppConfig {
/*
    @Bean(name = "healthCheckService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public HealthCheckService getHealthCheckService() {

        //HealthCheckServiceImpl service = new HealthCheckServiceImpl(getHealthCheckRepository());
        HealthCheckServiceImpl service = new HealthCheckServiceImpl();
        //service.setRepository(getHealthCheckRepository());
        return service;
    }

    @Bean(name = "healthCheckRepository")
    public HealthCheckRepository getHealthCheckRepository() {

        return new HealthCheckRepositoryImpl();
    }*/
}
