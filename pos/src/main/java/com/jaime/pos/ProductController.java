package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{

    @GetMapping(value = "/product")
    public String init()
    {
        return "Product Controller is working";
    }

}
