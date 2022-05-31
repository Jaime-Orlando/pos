package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.SaleModel;

public interface SaleServiceI
{
	public List<SaleModel> findAll();
	public SaleModel findBy(int id);
	public boolean deleteBy(int id);
	public SaleModel update(SaleModel saleModel);
}
