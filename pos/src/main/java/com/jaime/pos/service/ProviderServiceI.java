package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.ProviderModel;

public interface ProviderServiceI
{
	public List<ProviderModel> findAll();
	public ProviderModel findBy(int id);
	public boolean deleteBy(int id);
	public ProviderModel update(ProviderModel providerModel);
}
