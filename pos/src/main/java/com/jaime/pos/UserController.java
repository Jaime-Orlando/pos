package com.jaime.pos;

import com.jaime.pos.model.UserModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController
{

    @GetMapping("list")
    @ResponseBody
    public List<UserModel> read()
    {
        List<UserModel> users = new ArrayList<>();
        UserModel user = new UserModel();
        user.setId(2);
        user.setName("ben.freddy");
        user.setLastAccess(LocalDateTime.now());
        user.setRoleId(2);
        users.add(user);
        return users;
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
