package com.jaime.pos.controller.api;

import com.jaime.pos.model.ProductModel;
import com.jaime.pos.service.ProductServiceI;
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
public class ProductRestControllerTest {
    private MockMvc mockMvc;
    @Mock
    ProductServiceI productService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ProductRestController(productService)).build();
        List<ProductModel> productModels = findAll();
        when(productService.findAll()).thenReturn(productModels);
    }

    @Test
    public void testCreate() {
    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/product/list")
                        .param("page", "1")
                        .param("pageSize", "50")
                        .param("sortDesc", "asc"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        JSONObject response = new JSONObject(result.getResponse().getContentAsString());
        JSONArray items = response.getJSONArray("items");
        assertEquals(2, items.length());

    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testDelete() {
    }

    private List<ProductModel> findAll() {
        List<ProductModel> list = new ArrayList<>();
        ProductModel productModel = new ProductModel();
        productModel.setId(1);
        productModel.setBarCode("12345667");
        productModel.setDescription("A product that does something");
        productModel.setCategoryId(2);
        productModel.setName("Chocolate");
        productModel.setImgUri("Here goes the Image Uri");
        productModel.setMinStock(9);
        productModel.setInStock(2);
        productModel.setSku("123562RTX");
        list.add(productModel);
        list.add(productModel);
        return list;
    }
}