package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.RoleForm;
import com.jaime.pos.model.RoleModel;
import com.jaime.pos.model.RoleView;
import com.jaime.pos.service.RoleServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/role/")
public class RoleRestController
{

    private final RoleServiceI roleService;


    @PostMapping("new")
    @ResponseBody
    public RoleModel create(@RequestBody RoleForm roleForm)

    {
        RoleModel roleModel = convertToRoleModel(roleForm);
        roleService.save(roleModel);
        return roleModel;
    }

    private RoleModel convertToRoleModel(RoleForm roleForm)
    {
        RoleModel roleModel = new RoleModel();
        roleModel.setId(roleForm.getId());
        roleModel.setDescription(roleForm.getDescription());
        roleModel.setName(roleForm.getName());
        return roleModel;
    }


    @GetMapping("list")
    @ResponseBody
    public List<RoleModel> read()
    {
        return roleService.findAll();
    }

    @GetMapping("{roleId}")
    public RoleView getRoleDetail(@PathVariable int roleId) 
    {
    	return roleService.findBy(roleId);
    }

    @PostMapping("update")
    @ResponseBody
    public RoleModel update(@ModelAttribute RoleModel roleModel)
    {
        return roleModel;
    }

    @GetMapping("delete/{roleId}")
    @ResponseBody
    public String delete(@PathVariable int roleId)
    {
        return MessageFormat.format("Successfully deleted role with ID: {0}", roleId);
    }


}
