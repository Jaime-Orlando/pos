package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController
{

    @GetMapping(value = "/category")
    public String init()
    {
        return "Category Controller is working!";
    }

}
