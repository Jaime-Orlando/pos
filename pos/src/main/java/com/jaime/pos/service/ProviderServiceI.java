package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.ProviderModel;

public interface ProviderServiceI
{
	void save(ProviderModel providerModel);
	List<ProviderModel> findAll();
	ProviderModel findBy(int id);
	boolean deleteBy(int id);
	ProviderModel update(ProviderModel providerModel);


}
