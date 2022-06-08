package com.jaime.pos.controller.api.form;

import com.jaime.pos.model.Currency;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExpenseForm
{

    private int id;
    private String concept;
    private LocalDateTime date;
    private int employeeId;
    private Currency currency;
    private int storeId;
    private double amount;

}
