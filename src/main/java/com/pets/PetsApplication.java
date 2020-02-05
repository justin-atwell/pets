package com.pets;

import com.pets.configuration.AppConfig;
import com.pets.services.HealthCheckService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PetsApplication {

    public static void main(String[] args) {
       // ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //HealthCheckService service = appContext.getBean("healthCheckService", HealthCheckService.class);
        SpringApplication.run(PetsApplication.class, args);
    }

}
