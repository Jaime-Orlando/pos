package com.jaime.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "provider")
@Data
public class ProviderModel
{
	@Id
	private int id;
	private String name;
	private String address;

}
