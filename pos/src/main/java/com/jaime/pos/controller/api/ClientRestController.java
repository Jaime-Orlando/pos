package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.ClientForm;
import com.jaime.pos.model.ClientModel;
import com.jaime.pos.model.ClientView;
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

    @PostMapping("new")
    @ResponseBody
    public ClientModel create(@RequestBody ClientForm clientForm)
    {
        ClientModel clientModel = convertToClientModel(clientForm);
        clientService.save(clientModel);
        return clientModel;
    }

    private ClientModel convertToClientModel(ClientForm clientForm)
    {
        ClientModel clientModel = new ClientModel();
        clientModel.setId(clientForm.getSex());
        clientModel.setFirstName(clientForm.getFirstName());
        clientModel.setMiddleName(clientForm.getMiddleName());
        clientModel.setLastName(clientForm.getLastName());
        clientModel.setSex(clientForm.getSex());
        clientModel.setRfc(clientForm.getRfc());
        clientModel.setBirthdate(clientForm.getBirthdate());
        return clientModel;
    }

    @GetMapping("list")
    @ResponseBody
    public List<ClientModel> read()
    {
        return clientService.findAll();
    }
    
    @GetMapping("{clientId}")
    public ClientView getClientDetail(@PathVariable(name = "clientId") int clientId) 
    {
    	return clientService.findBy(clientId);
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Client OK";
    }

    @PostMapping("update")
    @ResponseBody
    public ClientModel update(@ModelAttribute ClientModel clientModel)
    {
        return clientModel;
    }
    @GetMapping("delete/{clientId}")
    @ResponseBody
    public String delete(@PathVariable String clientId)
    {
        return MessageFormat.format("Successfully deleted client with ID: {0}", clientId);
    }

}
