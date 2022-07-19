package com.jaime.pos.dao;

import com.jaime.pos.model.ProductModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<ProductModel, Integer>  
{


}
