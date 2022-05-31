package com.jaime.pos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.StoreModel;

@Service
public class StoreService implements StoreServiceI
{

	@Override
	public List<StoreModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoreModel findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBy(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StoreModel update(StoreModel storeModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
