package com.jaime.pos.service;

import java.util.List;
import com.jaime.pos.model.ProviderModel;
import com.jaime.pos.model.ProviderView;

public interface ProviderServiceI
{
	void save(ProviderModel providerModel);
	List<ProviderModel> findAll();
	List<ProviderModel> findAll_();
	ProviderView findBy(int id);
	boolean deleteBy(int id);
	ProviderModel update(ProviderModel providerModel);
}
