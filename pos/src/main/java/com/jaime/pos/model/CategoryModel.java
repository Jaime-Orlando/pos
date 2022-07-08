package com.jaime.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class CategoryModel 
{
	@Id
	private int id;
	private String name;
	private String description;
}
