package com.jaime.pos.dao;

import com.jaime.pos.model.ProductModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<ProductModel, String>  
{


}
