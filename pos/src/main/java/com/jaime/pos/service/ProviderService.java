package com.jaime.pos.service;

import java.util.ArrayList;
import java.util.List;
import com.jaime.pos.dao.ProviderDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jaime.pos.model.ProviderModel;
import com.jaime.pos.model.ProviderView;

@Service
@AllArgsConstructor
public class ProviderService implements ProviderServiceI
{

	private final ProviderDao providerDao;


	@Override
	public void save(ProviderModel providerModel)
	{
		providerDao.save(providerModel);
	}
	
	@Override
	public List<ProviderModel> findAll() 
	{
		return (List<ProviderModel>) providerDao.findAll();
	}

	@Override
	public List<ProviderModel> findAll_()
	{
		List<ProviderModel> providers = new ArrayList<>();
		ProviderModel provider = new ProviderModel();
		provider.setId(1);
		provider.setName("Woods L.C.");
		provider.setAddress("Circuito 3");
		providers.add(provider);
		return providers;
	}

	@Override
	public ProviderView findBy(int id) 
	{
		ProviderModel providerModel = providerDao.findById(id).get();
		ProviderView providerView = ProviderServiceHelper.convertModelToView(providerModel);
		return providerView;
	}

	@Override
	public ProviderModel update(ProviderModel providerModel) 
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
