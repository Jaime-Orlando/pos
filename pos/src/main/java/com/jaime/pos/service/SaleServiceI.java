package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.SaleModel;

public interface SaleServiceI
{
	void save(SaleModel saleModel);
	List<SaleModel> findAll();
	List<SaleModel> findAll_();
	SaleModel findBy(int id);
	SaleModel update(SaleModel saleModel);
	boolean deleteBy(int id);
}
