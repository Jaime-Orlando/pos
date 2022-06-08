package com.jaime.pos.controller.api.form;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ClientForm
{
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private char sex;
    private String rfc;
    private LocalDate birthdate;
}
