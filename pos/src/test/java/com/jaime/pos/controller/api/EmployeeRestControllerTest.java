package com.jaime.pos.controller.api;

import com.jaime.pos.model.EmployeeModel;
import com.jaime.pos.service.EmployeeServiceI;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class EmployeeRestControllerTest {
    private MockMvc mockMvc;
    @Mock
    EmployeeServiceI employeeService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new EmployeeRestController(employeeService)).build();
        List<EmployeeModel> employeeModels = findAll();
        when(employeeService.findAll()).thenReturn(employeeModels);
    }

    @Test
    public void testCreate() {

    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/employee/list")
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

    public void testUpdate() {

    }

    public void testDelete() {
    }

    private List<EmployeeModel> findAll() {
        List<EmployeeModel> employees = new ArrayList<>();
        EmployeeModel employee = new EmployeeModel();
        employee.setId(1);
        employee.setBirthdate(LocalDate.of(1990, 11, 12));
        employee.setEmail("alicia.ch@fl.com");
        employee.setFirstName("Alicia");
        employee.setPhone("336435677");
        employee.setLastName("Chávez");
        employee.setRfc("124234");
        employee.setStoreId(1);
        employee.setUserId(1);
        employees.add(employee);
        return employees;
    }

}
