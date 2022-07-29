package com.jaime.pos.service;

import org.springframework.beans.BeanUtils;

import com.jaime.pos.model.ClientModel;
import com.jaime.pos.model.ClientView;


public class ClientServiceHelper
{
	public static ClientView convertModelToView(ClientModel clientModel) 
	{
		ClientView clientView = new ClientView();
		BeanUtils.copyProperties(clientModel, clientView);
		return clientView;
	}
}
