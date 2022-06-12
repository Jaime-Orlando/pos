package com.jaime.pos.controller.api;

import com.jaime.pos.model.RoleModel;
import com.jaime.pos.service.RoleServiceI;
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
public class RoleRestControllerTest {
    private MockMvc mockMvc;

    @Mock
    RoleServiceI roleService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new RoleRestController(roleService)).build();
        List<RoleModel> roleModels = findAll();
        when(roleService.findAll()).thenReturn(roleModels);
    }

    @Test
    public void testCreate() {
    }

    @Test
    public void read() throws Exception {
        MvcResult result = mockMvc.perform(get("/role/list")
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

    public void testUpdate() {
    }

    public void testDelete() {
    }

    private List<RoleModel> findAll() {
        List<RoleModel> roles = new ArrayList<>();
        RoleModel role = new RoleModel();
        role.setId(1);
        role.setName("Administrator");
        role.setDescription("Has all privileges");
        roles.add(role);
        return roles;
    }
}
