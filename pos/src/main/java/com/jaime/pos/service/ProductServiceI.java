package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.ProductModel;

public interface ProductServiceI {

	void save(ProductModel productModel);
	List<ProductModel> findAll();
	ProductModel findBy(int id);
	boolean deleteBy(int id);
	ProductModel update(ProductModel productModel);


}
