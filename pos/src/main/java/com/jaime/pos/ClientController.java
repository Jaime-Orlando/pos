package com.jaime.pos;

import com.jaime.pos.model.ClientModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client/")
public class ClientController
{

    @GetMapping("list")
    @ResponseBody
    public List<ClientModel> read()
    {
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

    @GetMapping("delete/{clientId}")
    @ResponseBody
    public String delete(@PathVariable String clientId)
    {
        return MessageFormat.format("Successfully deleted client with ID: {0}", clientId);
    }

    @PostMapping("new")
    @ResponseBody
    public ClientModel create(@ModelAttribute ClientModel clientModel)
    {
        return clientModel;
    }

    @PostMapping("update")
    @ResponseBody
    public ClientModel update(@ModelAttribute ClientModel clientModel)
    {
        return clientModel;
    }

}
