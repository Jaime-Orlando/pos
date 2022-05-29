package com.jaime.pos.controller.api;

import com.jaime.pos.model.RoleModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/role/")
public class RoleRestController
{

    @GetMapping("list")
    @ResponseBody
    public List<RoleModel> read()
    {
        List<RoleModel> roles = new ArrayList<>();
        RoleModel role = new RoleModel();
        role.setId(1);
        role.setName("Administrator");
        role.setDescription("Has all privileges");
        roles.add(role);
        return roles;
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Role OK";
    }

    @GetMapping("delete/{roleId}")
    @ResponseBody
    public String delete(@PathVariable int roleId)
    {
        return MessageFormat.format("Successfully deleted role with ID: {0}", roleId);
    }

    @PostMapping("new")
    @ResponseBody
    public RoleModel create(@ModelAttribute RoleModel roleModel)
    {
        return roleModel;
    }

    @PostMapping("update")
    @ResponseBody
    public RoleModel update(@ModelAttribute RoleModel roleModel)
    {
        return roleModel;
    }

}
