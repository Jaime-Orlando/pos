package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosController
{

    @GetMapping("/init")
    public String init()
    {
        return "It's working";
    }

}