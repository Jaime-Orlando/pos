package com.jaime.pos.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class ClientView
{
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private char sex;
    private String rfc;
    private LocalDate birthdate;
}
