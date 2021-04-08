package com.jamesmansour.songr.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class MainControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void helloWorld() throws Exception {
        mockMvc.perform(get("/hello"))
            .andExpect(content().string(containsString("hello world.")))
            .andExpect(status().isOk());
    }

    @Test
    void capitalize() throws Exception {
        mockMvc.perform(get("/capitalize/testing"))
                .andExpect(content().string(containsString("TESTING")))
                .andExpect(status().isOk());
    }

    @Test
    void landing() throws Exception {
        String header = "<header>\n" +
                "    <a href=\"/\">Home</a>\n" +
                "    <h1>Songer</h1>\n" +
                "    <a href=\"/albums\">View albums</a>\n" +
                "</header>";
        mockMvc.perform(get("/"))
                .andExpect(content().string(containsString("<h1>Welcome to Songr!</h1>")))
//                .andExpect(content().string(containsString(header)))
                .andExpect(status().isOk());
    }
}