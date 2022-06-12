package com.jaime.pos.controller.api;

import com.jaime.pos.model.StoreModel;
import com.jaime.pos.service.StoreServiceI;
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
public class StoreRestControllerTest {
    private MockMvc mockMvc;
    @Mock
    StoreServiceI storeService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new StoreRestController(storeService)).build();
        List<StoreModel> storeModels = findAll();
        when(storeService.findAll()).thenReturn(storeModels);
    }

    @Test
    public void testCreate() {
    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/store/list")
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

    private List<StoreModel> findAll() {
        List<StoreModel> stores = new ArrayList<>();
        StoreModel store = new StoreModel();
        store.setAddress("Bellevue 34");
        store.setId(2);
        store.setManagerId(3);
        store.setName("BELLEVUE POINT 1");
        stores.add(store);
        return stores;
    }

}
