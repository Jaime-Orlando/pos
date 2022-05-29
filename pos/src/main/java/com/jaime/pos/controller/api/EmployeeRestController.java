package com.jaime.pos.controller.api;

import com.jaime.pos.model.EmployeeModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee/")
public class EmployeeRestController
{
    @GetMapping("list")
    public List<EmployeeModel> read()
    {
        List<EmployeeModel> employees = new ArrayList<>();
        EmployeeModel employee = new EmployeeModel();
        employee.setId(1);
        employee.setBirthdate(LocalDate.of(1990,11,12));
        employee.setEmail("alicia.ch@fl.com");
        employee.setFirstName("Alicia");
        employee.setPhone("336435677");
        employee.setLastName("Chávez");
        employee.setRfc("124234");
        employee.setStoreId(1);
        employee.setUserId(1);
        employees.add(employee);
        return employees;
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
