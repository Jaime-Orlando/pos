package com.jaime.pos.service;

import java.util.ArrayList;
import java.util.List;

import com.jaime.pos.dao.ProductDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.jaime.pos.model.ProductModel;
import com.jaime.pos.model.ProductView;

@Service
@AllArgsConstructor
public class ProductService implements ProductServiceI
{

	private final ProductDao productDao;
	
	@Override
	public void save(ProductModel productModel)
	{
		productDao.save(productModel);
	}
	
	@Override
	public List<ProductModel> findAll_() 
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
	public List<ProductModel> findAll()
	{
		return (List<ProductModel>) productDao.findAll();
	}

	@Override
	public ProductView findBy(int id)
	{
		ProductModel productModel = productDao.findById(id).get();
		ProductView productView = ProductServiceHelper.convertModelToView_(productModel);
		return productView;
	}
	
	@Override
	public ProductModel update(ProductModel productModel) 
	{
		return null;
	}

	@Override
	public boolean deleteBy(int id)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
