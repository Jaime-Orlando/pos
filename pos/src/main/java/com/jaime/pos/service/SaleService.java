package com.jaime.pos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.SaleModel;

@Service
public class SaleService implements SaleServiceI
{

	@Override
	public List<SaleModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaleModel findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBy(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SaleModel update(SaleModel saleModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
