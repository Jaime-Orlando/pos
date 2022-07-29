package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.EmployeeForm;
import com.jaime.pos.model.EmployeeModel;
import com.jaime.pos.model.EmployeeView;
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

    @PostMapping("new")
    @ResponseBody
    public EmployeeModel create(@RequestBody EmployeeForm employeeForm)
    {
        EmployeeModel employeeModel = convertToEmployeeModel(employeeForm);
        employeeService.save(employeeModel);
        return employeeModel;
    }

    private EmployeeModel convertToEmployeeModel(EmployeeForm employeeForm)
    {
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setId(employeeForm.getId());
        employeeModel.setFirstName(employeeForm.getFirstName());
        employeeModel.setLastName(employeeForm.getLastName());
        employeeModel.setPhone(employeeForm.getPhone());
        employeeModel.setEmail(employeeForm.getEmail());
        employeeModel.setRfc(employeeForm.getRfc());
        employeeModel.setBirthdate(employeeForm.getBirthdate());
        employeeModel.setStoreId(employeeForm.getStoreId());
        employeeModel.setUserId(employeeForm.getUserId());
        return employeeModel;
    }

    @GetMapping("list")
    public List<EmployeeModel> read()
    {
        return employeeService.findAll();
    }
    
    @GetMapping("{employeeId}")
    public EmployeeView getEmployeeDetail(@PathVariable(name = "employeeId") int employeeId) 
    {
    	return employeeService.findBy(employeeId);
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Employee OK";
    }

    @PostMapping("update")
    @ResponseBody
    public EmployeeModel update(@ModelAttribute EmployeeModel employeeModel)
    {
        return employeeModel;
    }

    @GetMapping("delete/{employeeId}")
    @ResponseBody
    public String delete(@PathVariable int employeeId)
    {
        return MessageFormat.format("Successfully deleted employee with id: {0}", employeeId);
    }

}
