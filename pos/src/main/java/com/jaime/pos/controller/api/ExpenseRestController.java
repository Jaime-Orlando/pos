package com.jaime.pos.controller.api;

import com.jaime.pos.model.ExpenseModel;
import com.jaime.pos.service.ExpenseServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/expense/")
public class ExpenseRestController
{

    private final ExpenseServiceI expenseService;

    @GetMapping("list")
    @ResponseBody
    public List<ExpenseModel> read()
    {
        return expenseService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Expense OK";
    }

    @GetMapping("delete/{expenseId}")
    @ResponseBody
    public String delete(@PathVariable int expenseId)
    {
        return MessageFormat.format("Successfully deleted expense with ID: {0}", expenseId);
    }

    @PostMapping("new")
    @ResponseBody
    public ExpenseModel create(@ModelAttribute ExpenseModel expenseModel)
    {
        return expenseModel;
    }

    @PostMapping("update")
    @ResponseBody
    public ExpenseModel update(@ModelAttribute ExpenseModel expenseModel)
    {
        return expenseModel;
    }
}
