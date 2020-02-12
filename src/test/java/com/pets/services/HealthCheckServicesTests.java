package com.pets.services;

import com.pets.repository.HealthCheckRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = SpringBootApplication.class)
public class HealthCheckServicesTests {

    @MockBean
    private HealthCheckRepository repository;

    @Autowired
    private HealthCheckService service;

    @Test
    public void getHealthCheckDateReturnsCurrentDateTime() throws Exception {
        LocalDateTime rightNow = LocalDateTime.now();

        when(repository.getHealthCheckDate()).thenReturn(rightNow);

        LocalDateTime result = service.getHealthCheckDate();

        //assertThat(result, rightNow);
        assertEquals(result, rightNow);
    }
}
