package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController
{

    @GetMapping(value = "/store")
    public String init()
    {
        return "Store Controller Working!!";
    }

}
