package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController
{

    @GetMapping(value = "/provider")
    public String init()
    {
        return "Provider Controller working";
    }

}
