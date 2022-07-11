package com.jaime.pos.model;

import lombok.Data;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sale")
@Data
public class SaleModel 
{

	@Id
	private int id;
	private int detailId;
	private int employeeId;
	private float discount;
	private int amount;
	@Enumerated(EnumType.STRING)
	private Currency currency;
	private int clientId;
	private float tax;
	private String observations;
	private int storeId;
	private LocalDateTime date;
}
