package com.jaime.pos.model;

import java.util.List;

import lombok.Data;

@Data
public class ProductListView 
{
	private List<ProductModel> items;
	private String description;
}
