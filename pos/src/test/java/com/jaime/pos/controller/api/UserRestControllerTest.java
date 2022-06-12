package com.jaime.pos.controller.api;

import com.jaime.pos.model.UserModel;
import com.jaime.pos.service.UserServiceI;
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
public class UserRestControllerTest {
    private MockMvc mockMvc;
    @Mock
    UserServiceI userService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new UserRestController(userService)).build();
        List<UserModel> userModels = findAll();
        when(userService.findAll()).thenReturn(userModels);
    }

    @Test
    public void create() {
    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/user/list")
                        .param("page", "1")
                        .param("pageSize", "50")
                        .param("sortDesc", "asc"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status()
                        .isOk())
                .andExpect(content()
                        .contentType(MediaType.APPLICATION_JSON)).andReturn();

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

    private List<UserModel> findAll() {
        List<UserModel> users = new ArrayList<>();
        UserModel user = new UserModel();
        user.setId(2);
        user.setName("ben.freddy");
        user.setLastAccess(LocalDateTime.now());
        user.setRoleId(2);
        users.add(user);
        return users;
    }
}
