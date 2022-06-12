package com.jaime.pos.controller.api;

import com.jaime.pos.model.Currency;
import com.jaime.pos.model.ExpenseModel;
import com.jaime.pos.service.ExpenseServiceI;
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
public class ExpenseRestControllerTest {

    private MockMvc mockMvc;
    @Mock
    ExpenseServiceI expenseService;

    @BeforeEach
    @ExtendWith(MockitoExtension.class)
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ExpenseRestController(expenseService)).build();
        List<ExpenseModel> expenseModels = findAll();
        when(expenseService.findAll()).thenReturn(expenseModels);
    }

    @Test
    public void testCreate() {

    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/expense/list")
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

    private List<ExpenseModel> findAll() {
        List<ExpenseModel> expenses = new ArrayList<>();
        ExpenseModel expense = new ExpenseModel();
        expense.setAmount(333);
        expense.setId(1);
        expense.setConcept("Shipping");
        expense.setCurrency(Currency.EUR);
        expense.setDate(LocalDateTime.now());
        expense.setEmployeeId(2);
        expense.setStoreId(3);
        expenses.add(expense);
        return expenses;
    }
}
