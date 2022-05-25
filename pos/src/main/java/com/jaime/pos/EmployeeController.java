package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{

    @GetMapping(value = "employee")
    public String init()
    {
        return "Employee Controller working!";
    }

}
