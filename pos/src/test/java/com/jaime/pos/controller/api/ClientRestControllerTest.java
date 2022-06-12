package com.jaime.pos.controller.api;

import com.jaime.pos.model.ClientModel;
import com.jaime.pos.service.ClientServiceI;
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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ClientRestControllerTest {
    private MockMvc mockMvc;
    @Mock
    ClientServiceI clientService;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ClientRestController(clientService)).build();
        List<ClientModel> clientModels = findAll();
        when(clientService.findAll()).thenReturn(clientModels);
    }

    @Test
    public void testCreate() {

    }

    @Test
    public void testRead() throws Exception {
        MvcResult result = mockMvc.perform(get("/client/list")
                        .param("page", "1")
                        .param("pageSize", "50")
                        .param("sortDesc", "asc"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testDelete() {
    }

    private List<ClientModel> findAll() {
        List<ClientModel> clients = new ArrayList<>();
        ClientModel client = new ClientModel();
        client.setId(1);
        client.setBirthdate(LocalDate.of(1999, 6, 25));
        client.setFirstName("Jaime");
        client.setLastName("López");
        client.setRfc("123456");
        client.setMiddleName("Orlando");
        client.setSex('M');
        clients.add(client);
        return clients;
    }

}
