package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sale
{

    @GetMapping(value = "sale")
    public String init()
    {
        return "Sale Controller Working!";
    }

}
