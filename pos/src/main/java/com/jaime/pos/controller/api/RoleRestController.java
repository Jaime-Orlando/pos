package com.jaime.pos.controller.api;

import com.jaime.pos.model.RoleModel;
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

    @GetMapping("list")
    @ResponseBody
    public List<RoleModel> read()
    {
        return roleService.findAll();
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
