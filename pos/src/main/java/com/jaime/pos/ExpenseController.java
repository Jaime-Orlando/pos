package com.jaime.pos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController
{

    @GetMapping(value = "/expense")
    public String init()
    {
        return "Expense Controller is working";
    }

}
