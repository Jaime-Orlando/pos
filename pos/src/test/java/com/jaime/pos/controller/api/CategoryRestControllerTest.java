package com.jaime.pos.controller.api;

import com.jaime.pos.model.CategoryModel;
import com.jaime.pos.service.CategoryServiceI;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CategoryRestControllerTest {
    private MockMvc mockMvc;

    @Mock
    CategoryServiceI categoryService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new CategoryRestController(categoryService)).build();
        List<CategoryModel> categoryModels = findAll();
        when(categoryService.findAll()).thenReturn(categoryModels);
    }

    @Test
    public void testCreate() {

    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/category/list")
                        .param("page", "1")
                        .param("pageSize", "50")
                        .param("sortDesc", "asc"))
                .andDo(print())
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

    private List<CategoryModel> findAll() {
        List<CategoryModel> categoryModels = new ArrayList<>();
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(1);
        categoryModel.setDescription("Entertainment Content");
        categoryModel.setName("Entertainment");
        categoryModels.add(categoryModel);
        categoryModels.add(categoryModel);
        return categoryModels;
    }
}
