package com.jaime.pos.controller.api.form;

import lombok.Data;

@Data
public class StoreForm
{

    private int id;
    private String name;
    private int managerId;
    private String address;

}
