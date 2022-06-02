package com.jaime.pos.controller.api;

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

    @GetMapping("delete/{userId}")
    @ResponseBody
    public String delete(@PathVariable int userId)
    {
        return MessageFormat.format("Successfully deleted user with ID: {0}", userId);
    }

    @PostMapping("new")
    @ResponseBody
    public UserModel create(@ModelAttribute UserModel userModel)
    {
        return userModel;
    }

    @PostMapping("update")
    @ResponseBody
    public UserModel update(@ModelAttribute UserModel userModel)
    {
        return userModel;
    }

}
