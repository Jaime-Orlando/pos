package com.jaime.pos.controller.api;

import com.jaime.pos.model.ProviderModel;
import com.jaime.pos.service.ProviderServiceI;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ProviderRestControllerTest {

    private MockMvc mockMvc;
    @Mock
    ProviderServiceI providerService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ProviderRestController(providerService)).build();
        List<ProviderModel> providerModels = findAll();
        when(providerService.findAll()).thenReturn(providerModels);
    }

    @Test
    public void testCreate() {

    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/provider/list")
                        .param("page", "1")
                        .param("pageSize", "50")
                        .param("sortDesc", "asc"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status()
                        .isOk())
                .andExpect(content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        JSONObject response = new JSONObject(result.getResponse().getContentAsString());
        JSONArray items = response.getJSONArray("items");
        assertEquals(1, items.length());
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testDelete() {
    }

    private List<ProviderModel> findAll() {
        List<ProviderModel> providers = new ArrayList<>();
        ProviderModel provider = new ProviderModel();
        provider.setId(1);
        provider.setName("Woods L.C.");
        provider.setAddress("Circuito 3");
        providers.add(provider);
        return providers;
    }


}
