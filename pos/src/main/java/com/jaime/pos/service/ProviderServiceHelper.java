package com.jaime.pos.service;

import org.springframework.beans.BeanUtils;

import com.jaime.pos.model.ProviderModel;
import com.jaime.pos.model.ProviderView;

public class ProviderServiceHelper
{
	public static ProviderView convertModelToView(ProviderModel providerModel) 
	{
		ProviderView providerView = new ProviderView();
		BeanUtils.copyProperties(providerModel, providerView);
		return providerView;
	}
}
