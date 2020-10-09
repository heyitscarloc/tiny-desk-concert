package org.npr.tinydeskconcert.controller.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ContestControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getContestSubmissionPage() throws Exception {
        mockMvc.perform(get("/contest")).andExpect(status().isOk());
    }
    
    @Test
    public void postContestSubmissionPage() throws Exception {
    	mockMvc.perform(post("/contest")).andExpect(status().is3xxRedirection());
    }
    
    @Test
    public void getAfterRedirect() throws Exception {
		mockMvc.perform(get("/contest/submit")).andExpect(status().isOk());
    }
}
