package com.acropolis.campushiring;

import com.acropolis.campushiring.dto.BfhlRequest;
import com.acropolis.campushiring.dto.BfhlResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class BfhlControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testBfhlEndpoint() throws Exception {
        BfhlRequest request = new BfhlRequest();
        request.setData(Arrays.asList("a", "1", "334", "4", "R", "$"));

        MvcResult result = mockMvc.perform(post("/bfhl")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andReturn();

        BfhlResponse response = objectMapper.readValue(
                result.getResponse().getContentAsString(),
                BfhlResponse.class
        );

        assertTrue(response.isIs_success());
        assertEquals("ananya_sharma_17012005", response.getUser_id());
        assertEquals("ananyasharma231341@acropolis.in", response.getEmail());
        assertEquals("0827CY231012", response.getRoll_number());
        assertEquals(Arrays.asList("1"), response.getOdd_numbers());
        assertEquals(Arrays.asList("334", "4"), response.getEven_numbers());
        assertEquals(Arrays.asList("A", "R"), response.getAlphabets());
        assertEquals(Arrays.asList("$"), response.getSpecial_characters());
        assertEquals("339", response.getSum());
        assertEquals("Ra", response.getConcat_string());
    }

    @Test
    public void testMultiCharacterAlphabets() throws Exception {
        BfhlRequest request = new BfhlRequest();
        request.setData(Arrays.asList("A", "ABCD", "DOE"));

        MvcResult result = mockMvc.perform(post("/bfhl")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andReturn();

        BfhlResponse response = objectMapper.readValue(
                result.getResponse().getContentAsString(),
                BfhlResponse.class
        );

        assertEquals("EoDdCbAa", response.getConcat_string());
    }
}
