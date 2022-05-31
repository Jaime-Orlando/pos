package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.ProductModel;

public interface ProductServiceI {

	public List<ProductModel> findAll();
	public ProductModel findBy(int id);
	public boolean deleteBy(int id);
	public ProductModel update(ProductModel productModel);
}
