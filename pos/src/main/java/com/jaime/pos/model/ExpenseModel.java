package com.jaime.pos.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExpenseModel
{

	private int id;
	private String concept;
	private LocalDateTime date;
	private int employeeId;
	private Currency currency;
	private int storeId;
	private double amount;
	
}
