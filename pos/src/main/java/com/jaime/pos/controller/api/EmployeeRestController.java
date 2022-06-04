package com.jaime.pos.controller.api;

import com.jaime.pos.model.EmployeeModel;
import com.jaime.pos.service.EmployeeServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employee/")
public class EmployeeRestController
{

    private final EmployeeServiceI employeeService;

    @GetMapping("list")
    public List<EmployeeModel> read()
    {
        return employeeService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Employee OK";
    }

    @GetMapping("delete/{employeeId}")
    @ResponseBody
    public String delete(@PathVariable int employeeId)
    {
        return MessageFormat.format("Successfully deleted employee with id: {0}", employeeId);
    }

    @PostMapping("new")
    @ResponseBody
    public EmployeeModel create(@ModelAttribute EmployeeModel employeeModel)
    {
        return employeeModel;
    }

    @PostMapping("update")
    @ResponseBody
    public EmployeeModel update(@ModelAttribute EmployeeModel employeeModel)
    {
        return employeeModel;
    }


}
