package com.jaime.pos.controller.api;

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
