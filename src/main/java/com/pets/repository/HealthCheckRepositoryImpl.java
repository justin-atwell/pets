package com.pets.repository;

import java.util.Date;

public class HealthCheckRepositoryImpl implements HealthCheckRepository{

    public Date healthCheckDate() {
        Date date = new Date();
        System.out.println(date);
        return date;
    }
}
