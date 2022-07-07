package com.jaime.pos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class ProductModel {
	@Id
	private long id;
	private String name;
	private String description;
	private double price;
	private int inStock;
	private int minStock;
	private String barCode;
	private String sku;
	private String imgUri;
	private int categoryId;
	
}
