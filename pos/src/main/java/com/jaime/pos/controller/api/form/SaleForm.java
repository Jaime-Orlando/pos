package com.jaime.pos.controller.api.form;
import com.jaime.pos.model.Currency;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SaleForm
{

    private int id;
    private int detailId;
    private int employeeId;
    private float discount;
    private int amount;
    private Currency currency;
    private int clientId;
    private float tax;
    private String observations;
    private int storeId;
    private LocalDateTime date;
}