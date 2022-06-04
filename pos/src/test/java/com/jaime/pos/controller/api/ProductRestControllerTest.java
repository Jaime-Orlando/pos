package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.ProductRestController;
import com.jaime.pos.service.ProductService;
import com.jaime.pos.service.ProductServiceI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONArray;
import org.json.JSONObject;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@ContextConfiguration(classes = ProductRestController.class)
@ExtendWith(MockitoExtension.class)
public class ProductRestControllerTest
{
    private MockMvc mockMvc;
    
    ProductServiceI productService;

    @BeforeEach
    public void setup(WebApplicationContext context)
    {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        productService = mock(ProductService.class);
    }

    @Test
    public void testList() throws Exception
    {
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
    	assertEquals(items.length(), 2);
    	
    }
    
    @Test
    public void testRunning() throws Exception
    {
        mockMvc.perform(get("/product/list/running"))
                .andDo(print())
                .andExpect(status()
                        .isOk())
                .andExpect(content()
                        .string(containsString("Product OK")));
    }
    

}
