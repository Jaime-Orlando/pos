package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.StoreModel;

public interface StoreServiceI 
{
	public List<StoreModel> findAll();
	public StoreModel findBy(int id);
	public boolean deleteBy(int id);
	public StoreModel update(StoreModel storeModel);
}
