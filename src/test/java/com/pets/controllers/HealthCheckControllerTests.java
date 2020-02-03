package com.pets.controllers;

import com.mysql.cj.util.TestUtils;
import com.pets.services.HealthCheckService;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

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
        //String dateFormatter = "yyyy-MM-dd HH:mm:ss";
        //String dateFormatter = "yyyy-MM-dd HH:mm:ss.SSS";
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatter);

        LocalDateTime rightNow = LocalDateTime.now();

        when(service.getHealthCheckDate()).thenReturn(rightNow);

        MvcResult result = mockMvc.perform(get("/healthCheck"))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andReturn();
            .getResponse()
            //.getContentAsString();

        String content = result.getResponse().getContentAsString();

        System.out.println("Right now as LocalDateTime: " + rightNow);
        System.out.println("Right now as string: " + rightNow.toString());
        System.out.println(("Result: " + result));
        System.out.println("Content as String: " + content);

        //LocalDateTime formattedResult = LocalDateTime.parse(result, formatter);
        LocalDateTime formattedContent = LocalDateTime.parse(content, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Result as LocalDateTime: " + formattedContent);
    }
    /*@Test
    public void getHealthCheckReturnsCurrentDate() throws Exception {
        LocalDateTime rightNow = LocalDateTime.now();
        when(service.getHealthCheckDate()).thenReturn(rightNow);
        String result = mockMvc.perform((get("/healthCheck")))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse()
                .getContentAsString();

        System.out.println("Right now date:" + rightNow);
        System.out.println("Right now string:" + rightNow.toString());;
        System.out.println("Result:" + result);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        LocalDateTime formattedTime = LocalDateTime.parse(result, formatter);

        System.out.println("Result as LocalDateTime:" + formattedTime);

        assertEquals(result, rightNow);
    }*/
}
