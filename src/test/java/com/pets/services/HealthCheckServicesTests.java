package com.pets.services;

import com.pets.repository.HealthCheckRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest(classes = SpringBootApplication.class)
public class HealthCheckServicesTests {

    @MockBean
    private HealthCheckRepository repository;

    @Autowired
    private HealthCheckService service;

   // @Test
    //private static final String DATE_FORMATTER= "yyyy-MM-dd HH:mm:ss";

    /*public static void main(String[] args) {

        String DATE_FORMATTER= "yyyy-MM-dd HH:mm:ss";

        LocalDateTime localDateTime = LocalDateTime.now(); //get current date time
        System.out.println("Current Time " + localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        String formatDateTime = localDateTime.format(formatter);

        System.out.println("Formatted Time :" +formatDateTime);

    }*/
}
