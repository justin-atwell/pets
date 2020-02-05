package com.pets.services;

import com.pets.repository.HealthCheckRepository;
import com.pets.repository.HealthCheckRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service("healthCheckService")
public class HealthCheckServiceImpl implements HealthCheckService{

    private HealthCheckRepository healthCheckRepository = new HealthCheckRepositoryImpl();

    //delete this constructor later
    /*public HealthCheckServiceImpl() {
        System.out.println("SpeakerServiceImpl no arguments constructor");
    }*/
    @Autowired
    public HealthCheckServiceImpl (HealthCheckRepository healthCheckRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        healthCheckRepository = healthCheckRepository;
    }

   //@Autowired
    public void setRepository(HealthCheckRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.healthCheckRepository = repository;
    }



    public LocalDateTime getHealthCheckDate() {

        return healthCheckRepository.getHealthCheckDate();
    }
}
