package com.pets.controllers;

import com.pets.services.HealthCheckService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@AutoConfigureMockMvc
@SpringBootTest
public class HealthCheckControllerTests {
    @Autowired
   private MockMvc mockMvc;

    @MockBean
    private HealthCheckService service;

    @Test
    public void getHealthCheckCallsHealthCheckService() throws Exception {
        mockMvc.perform(get("/healthCheck"));
        verify(service, times(1)).getHealthCheckDate();
    }
    @Test
    public void getHealthCheckReturnsCorrectDate() throws Exception {
        LocalDateTime rightNow = LocalDateTime.now();

        when(service.getHealthCheckDate()).thenReturn(rightNow);

        MockHttpServletResponse result = mockMvc.perform(get("/healthCheck"))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andReturn()
            .getResponse();

        String content = result.getContentAsString();
        Integer endIndex = content.length() -1;
        String substring = content.substring(1, endIndex);

        System.out.println("Right now as LocalDateTime: " + rightNow);
        System.out.println("Right now as string: " + rightNow.toString());
        System.out.println(("Result: " + result));
        System.out.println("Content: " + content);
        System.out.println("Substring: " + substring);

        LocalDateTime formattedContent = LocalDateTime.parse(substring, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println("Result as LocalDateTime: " + formattedContent);
    }
}
