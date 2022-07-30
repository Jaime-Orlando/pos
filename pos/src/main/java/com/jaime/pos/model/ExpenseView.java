package com.jaime.pos.model;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ExpenseView
{

    private int id;
    private String concept;
    private LocalDateTime date;
    private int employeeId;
    private Currency currency;
    private int storeId;
    private double amount;

}
