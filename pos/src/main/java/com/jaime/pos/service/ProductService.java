package com.jaime.pos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.ProductModel;

@Service
public class ProductService implements ProductServiceI
{

	@Override
	public List<ProductModel> findAll() 
	{
		// TODO Auto-generated method stub
		return null;
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
