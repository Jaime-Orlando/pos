package com.jaime.pos.controller.api;

import com.jaime.pos.model.ProviderModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/provider/")
public class ProviderRestController
{

    @GetMapping("list")
    @ResponseBody
    public List<ProviderModel> read()
    {
        List<ProviderModel> providers = new ArrayList<>();
        ProviderModel provider = new ProviderModel();
        provider.setId(1);
        provider.setName("Woods L.C.");
        provider.setAddress("Circuito 3");
        providers.add(provider);
        return providers;
    }

    @GetMapping("delete/{providerId}")
    @ResponseBody
    public String delete(@PathVariable int providerId)
    {
        return MessageFormat.format("Successfully deleted provider with ID: {0}",providerId);
    }

    @PostMapping("new")
    @ResponseBody
    public ProviderModel create(@ModelAttribute ProviderModel providerModel)
    {
        return providerModel;
    }

    @PostMapping("update")
    @ResponseBody
    public ProviderModel update(@ModelAttribute ProviderModel providerModel)
    {
        return providerModel;
    }


}
