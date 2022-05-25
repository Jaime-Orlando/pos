package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleItemController
{

    @GetMapping(value = "/sale-item")
    public String init()
    {
        return "Sale Item Controller Working!";
    }

}
