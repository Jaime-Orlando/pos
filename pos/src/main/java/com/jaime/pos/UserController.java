package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

    @GetMapping(value = "/user")
    public String init()
    {
        return "User Controller working!";
    }

}
