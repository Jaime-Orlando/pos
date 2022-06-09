package com.jaime.pos.controller.api.form;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserForm
{

    private int id;
    private String name;
    private LocalDateTime lastAccess;
    private int roleId;

}