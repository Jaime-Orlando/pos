package com.jaime.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class RoleModel 
{
	@Id
	private int id;
	private String description;
	private String name;
}
