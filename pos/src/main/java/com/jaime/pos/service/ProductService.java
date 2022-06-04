package com.jaime.pos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.ProductModel;

@Service
public class ProductService implements ProductServiceI
{

	@Override
	public List<ProductModel> findAll() 
	{
		List<ProductModel> list = new ArrayList<>();
		ProductModel productModel = new ProductModel();
		productModel.setId(1);
		productModel.setBarCode("12345667");
		productModel.setDescription("A product that does something");
		productModel.setCategoryId(2);
		productModel.setName("Chocolate");
		productModel.setImgUri("Here goes the Image Uri");
		productModel.setMinStock(9);
		productModel.setInStock(2);
		productModel.setSku("123562RTX");
		list.add(productModel);
		list.add(productModel);
		return list;
	}

	@Override
	public ProductModel findBy(int id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBy(int id)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductModel update(ProductModel productModel) 
	{
		// TODO Auto-generated method stub
		return null;
	}


}
