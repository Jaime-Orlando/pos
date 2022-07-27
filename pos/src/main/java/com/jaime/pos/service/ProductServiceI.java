package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.ProductModel;
import com.jaime.pos.model.ProductView;

public interface ProductServiceI {

	void save(ProductModel productModel);
	List<ProductModel> findAll();
	List<ProductModel> findAll_();
	ProductView findBy(int id);
	boolean deleteBy(int id);
	ProductModel update(ProductModel productModel);
	
}
