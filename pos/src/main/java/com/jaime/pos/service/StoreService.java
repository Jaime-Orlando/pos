package com.jaime.pos.service;

import java.util.ArrayList;
import java.util.List;
import com.jaime.pos.dao.StoreDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jaime.pos.model.StoreModel;

@Service
@AllArgsConstructor
public class StoreService implements StoreServiceI
{
	private final StoreDao storeDao;

	@Override
	public void save(StoreModel storeModel) 
	{
		storeDao.save(storeModel);
	}
	
	@Override
	public List<StoreModel> findAll() {
		return (List<StoreModel>) storeDao.findAll();
	}

	@Override
	public List<StoreModel> findAll_() 
	{
		List<StoreModel> stores = new ArrayList<>();
		StoreModel store = new StoreModel();
		store.setAddress("Bellevue 34");
		store.setId(2);
		store.setManagerId(3);
		store.setName("BELLEVUE POINT 1");
		stores.add(store);
		return stores;
	}

	@Override
	public StoreModel findBy(int id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoreModel update(StoreModel storeModel) 
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

}
