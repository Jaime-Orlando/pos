package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.UserForm;
import com.jaime.pos.model.UserModel;
import com.jaime.pos.service.UserServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user/")
public class UserRestController
{

    private final UserServiceI userService;
    @PostMapping("new")
    @ResponseBody
    public UserModel create(@RequestBody UserForm userForm)
    {
        UserModel userModel = convertToUserModel(userForm);
        userService.save(userModel);
        return userModel;
    }

    private UserModel convertToUserModel(UserForm userForm)
    {
        UserModel userModel = new UserModel();
        userModel.setId(userForm.getId());
        userModel.setName(userForm.getName());
        userModel.setLastAccess(userForm.getLastAccess());
        userModel.setRoleId(userForm.getRoleId());
        return userModel;
    }

    @GetMapping("list")
    @ResponseBody
    public List<UserModel> read()
    {
       return userService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "User OK";
    }

    @PostMapping("update")
    @ResponseBody
    public UserModel update(@ModelAttribute UserModel userModel)
    {
        return userModel;
    }

    @GetMapping("delete/{userId}")
    @ResponseBody
    public String delete(@PathVariable int userId)
    {
        return MessageFormat.format("Successfully deleted user with ID: {0}", userId);
    }
}
