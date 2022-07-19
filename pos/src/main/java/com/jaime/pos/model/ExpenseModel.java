package com.jaime.pos.model;

import lombok.Data;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense")
@Data
public class ExpenseModel
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String concept;
	private LocalDateTime date;
	private int employeeId;
	@Enumerated(EnumType.STRING)
	private Currency currency;
	private int storeId;
	private double amount;
	
}
