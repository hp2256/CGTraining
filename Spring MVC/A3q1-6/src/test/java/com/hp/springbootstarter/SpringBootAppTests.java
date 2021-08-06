package com.hp.springbootstarter;


import com.hp.springbootstarter.Q1.HelloController;
import com.hp.springbootstarter.Q2.UserAuthController;
import com.hp.springbootstarter.Q2.ValidateService;
import com.hp.springbootstarter.Q3.FindLocationService;
import com.hp.springbootstarter.Q3.FindLocationsController;
import com.hp.springbootstarter.Q3.Locations;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.regex.Matcher;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc // need this in Spring Boot test

class
SpringBootAppTests {

    @Autowired
    private MockMvc mockMvcHello;

    @Autowired
    private MockMvc mockMvcQ2;

    @Autowired
    private MockMvc mockMvcQ3;

    @Mock
    private ValidateService validateService;
    @Mock
    private FindLocationService findLocationService;

    @InjectMocks
    private HelloController helloController;
    @InjectMocks
    private UserAuthController userAuthController;
    @InjectMocks
    private FindLocationsController findLocationsController;

    @BeforeEach
    public void setUp() throws Exception {
        mockMvcHello = MockMvcBuilders.standaloneSetup(helloController).build();
        mockMvcQ2 = MockMvcBuilders.standaloneSetup(userAuthController).build();
        mockMvcQ3=MockMvcBuilders.standaloneSetup(findLocationsController).build();
    }

    @Test
    void testHelloWorld() throws Exception {
        mockMvcHello.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string("Hello World"));
    }

    @Test
    void testUserAuth() throws Exception {
        String user = "{\"id\":\"hp\",\"password\":\"123\"}";
        // Mockito.when(validateService.validateUser( ))
        mockMvcQ2
                .perform(post("/userauth")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(user).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(content().string("valid user"))
        ;
    }

    @Test
    void testQ3()throws Exception{
        Mockito.when(findLocationService.findLocation(14207)).thenReturn(new Locations("NYC", "NYC", "USA", 14207));
        mockMvcQ3.perform(get("/findlocationinfo/14207"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.state").value("NYC"))
                .andExpect(jsonPath("$.city").value("NYC"))
                .andExpect(jsonPath("$.country").value("USA"));

    }
}
