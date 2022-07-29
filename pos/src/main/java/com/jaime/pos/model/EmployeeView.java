package com.jaime.pos.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class EmployeeView
{
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String rfc;
    private LocalDate birthdate;
    private int storeId;
    private int userId;
}