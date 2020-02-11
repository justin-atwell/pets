package com.pets.controllers;

import com.pets.services.PetService;
import com.pets.views.PetView;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PetControllerTests {

    @MockBean
    private PetService petService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void petControllerReturnsPetsFromPetsService() throws Exception {
        List<PetView> pets = new ArrayList<PetView>();

        when(petService.getAllPets()).thenReturn(pets);

        MockHttpServletResponse wrappedResponse = mockMvc.perform(get("/pets")).andExpect(status().is2xxSuccessful()).andReturn().getResponse();
    }
}
