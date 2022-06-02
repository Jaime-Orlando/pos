package com.jaime.pos.controller.api;

import com.jaime.pos.model.ClientModel;
import com.jaime.pos.service.ClientServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client/")
public class ClientRestController

{
    private final ClientServiceI clientService;

    @GetMapping("list")
    @ResponseBody
    public List<ClientModel> read()
    {
        return clientService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Client OK";
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
