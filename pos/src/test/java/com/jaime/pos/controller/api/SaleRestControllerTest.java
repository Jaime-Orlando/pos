package com.jaime.pos.controller.api;

import com.jaime.pos.model.Currency;
import com.jaime.pos.model.SaleModel;
import com.jaime.pos.service.SaleServiceI;
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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class SaleRestControllerTest {
    private MockMvc mockMvc;
    @Mock
    SaleServiceI saleService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new SaleRestController(saleService)).build();
        List<SaleModel> saleModels = findAll();
        when(saleService.findAll()).thenReturn(saleModels);
    }

    @Test
    public void testCreate() {
    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/sale/list")
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

    private List<SaleModel> findAll() {
        List<SaleModel> sales = new ArrayList<>();
        SaleModel sale = new SaleModel();
        sale.setId(1);
        sale.setAmount(2);
        sale.setCurrency(Currency.MXN);
        sale.setDate(LocalDateTime.now());
        sale.setDetailId(1);
        sale.setEmployeeId(1);
        sale.setObservations("NONE");
        sale.setStoreId(1);
        sale.setTax(12.5f);
        sale.setDiscount(5.0f);
        sales.add(sale);
        return sales;
    }
}
