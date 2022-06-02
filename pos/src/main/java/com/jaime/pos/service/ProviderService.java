package com.jaime.pos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.ProviderModel;

@Service
public class ProviderService implements ProviderServiceI
{

	@Override
	public List<ProviderModel> findAll() {
		List<ProviderModel> providers = new ArrayList<>();
		ProviderModel provider = new ProviderModel();
		provider.setId(1);
		provider.setName("Woods L.C.");
		provider.setAddress("Circuito 3");
		providers.add(provider);
		return providers;
	}

	@Override
	public ProviderModel findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBy(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProviderModel update(ProviderModel providerModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
