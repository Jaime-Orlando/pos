package com.jaime.pos.controller.api;

import com.jaime.pos.model.Currency;
import com.jaime.pos.model.ExpenseModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/expense/")
public class ExpenseRestController
{

    @GetMapping("list")
    @ResponseBody
    public List<ExpenseModel> read()
    {
        List<ExpenseModel> expenses = new ArrayList<>();
        ExpenseModel expense = new ExpenseModel();
        expense.setAmount(333);
        expense.setId(1);
        expense.setConcept("Shipping");
        expense.setCurrency(Currency.EUR);
        expense.setDate(LocalDateTime.now());
        expense.setEmployeeId(2);
        expense.setStoreId(3);
        expenses.add(expense);
        return expenses;
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
