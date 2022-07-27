package com.jaime.pos.service;

import com.jaime.pos.model.ProductModel;
import com.jaime.pos.model.ProductView;
import org.springframework.beans.BeanUtils;

public class ProductServiceHelper 
{
	
	public static ProductView convertModelToView(ProductModel productModel) 
	{
		ProductView productView = new ProductView();
		productView.setId(productModel.getId());
		productView.setName(productModel.getName());
		productView.setDescription(productModel.getDescription());
		productView.setPrice(productModel.getPrice());
		productView.setInStock(productModel.getInStock());
		productView.setMinStock(productModel.getMinStock());
		productView.setBarCode(productModel.getBarCode());
		productView.setSku(productModel.getSku());
		productView.setImgUri(productModel.getImgUri());
		productView.setCategoryId(productModel.getCategoryId());
		return productView;
	}
	
	// WARNING: Use only when sure that attribute names match
	public static ProductView convertModelToView_(ProductModel productModel) 
	{
		ProductView productView = new ProductView();
		BeanUtils.copyProperties(productModel, productView);
		return productView;
	}

}
