package com.jaime.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "store")
@Data
public class StoreModel 
{
	@Id
	private int id;
	private String name;
	private int managerId;
	private String address;
}
