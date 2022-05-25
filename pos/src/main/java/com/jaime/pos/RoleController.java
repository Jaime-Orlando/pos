package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController
{

    @GetMapping(value = "/role")
    public String init()
    {
        return "Role Controller Working!";
    }

}
