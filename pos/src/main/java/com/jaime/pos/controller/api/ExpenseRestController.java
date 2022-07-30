package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.ExpenseForm;
import com.jaime.pos.model.ExpenseModel;
import com.jaime.pos.model.ExpenseView;
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
    @PostMapping("new")
    @ResponseBody
    public ExpenseModel create(@RequestBody ExpenseForm expenseForm)
    {
        ExpenseModel expenseModel = convertToExpenseModel(expenseForm);
        expenseService.save(expenseModel);
        return expenseModel;
    }

    private ExpenseModel convertToExpenseModel(ExpenseForm expenseForm)
    {
        ExpenseModel expenseModel = new ExpenseModel();
        expenseModel.setId(expenseForm.getId());
        expenseModel.setConcept(expenseForm.getConcept());
        expenseModel.setDate(expenseForm.getDate());
        expenseModel.setEmployeeId(expenseForm.getEmployeeId());
        expenseModel.setCurrency(expenseForm.getCurrency());
        expenseModel.setStoreId(expenseForm.getStoreId());
        expenseModel.setAmount(expenseForm.getAmount());
        return expenseModel;
    }

    @GetMapping("list")
    @ResponseBody
    public List<ExpenseModel> read()
    {
        return expenseService.findAll();
    }
    
    @GetMapping("{expenseId}")
    public ExpenseView getExpenseDetail(@PathVariable(name = "expenseId") int expenseId) 
    {
    	return expenseService.findBy(expenseId);
    }

    @PostMapping("update")
    @ResponseBody
    public ExpenseModel update(@ModelAttribute ExpenseModel expenseModel)
    {
        return expenseModel;
    }

    @GetMapping("delete/{expenseId}")
    @ResponseBody
    public String delete(@PathVariable int expenseId)
    {
        return MessageFormat.format("Successfully deleted expense with ID: {0}", expenseId);
    }

}
