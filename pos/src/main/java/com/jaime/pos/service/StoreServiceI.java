package com.jaime.pos.service;

import java.util.List;
import com.jaime.pos.model.StoreModel;

public interface StoreServiceI 
{
	void save(StoreModel storeModel);
	List<StoreModel> findAll();
	List<StoreModel> findAll_();
	StoreModel findBy(int id);
	StoreModel update(StoreModel storeModel);
	boolean deleteBy(int id);
}
