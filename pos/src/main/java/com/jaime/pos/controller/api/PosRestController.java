package com.jaime.pos.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosRestController
{

    @GetMapping(value = "/init")
    public String init()
    {
        return "It's working";
    }

}