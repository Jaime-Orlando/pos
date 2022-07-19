package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.ProviderForm;
import com.jaime.pos.model.ProviderModel;
import com.jaime.pos.service.ProviderServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/provider/")
public class ProviderRestController
{

    private final ProviderServiceI providerService;

    @PostMapping("new")
    @ResponseBody
    public ProviderModel create(@RequestBody ProviderForm providerForm)
    {
        ProviderModel providerModel = convertToProviderModel(providerForm);
        providerService.save(providerModel);
        return providerModel;
    }

    private ProviderModel convertToProviderModel(ProviderForm providerForm)
    {
        ProviderModel providerModel = new ProviderModel();
        providerModel.setId(providerForm.getId());
        providerModel.setName(providerForm.getName());
        providerModel.setAddress(providerForm.getAddress());
        return providerModel;
    }

    @GetMapping("list")
    @ResponseBody
    public List<ProviderModel> read()
    {
        return providerService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Provider OK";
    }

    @PostMapping("update")
    @ResponseBody
    public ProviderModel update(@ModelAttribute ProviderModel providerModel)
    {
        return providerModel;
    }

    @GetMapping("delete/{providerId}")
    @ResponseBody
    public String delete(@PathVariable int providerId)
    {
        return MessageFormat.format("Successfully deleted provider with ID: {0}",providerId);
    }

}
