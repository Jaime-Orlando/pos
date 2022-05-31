package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.ClientModel;

public interface ClientServiceI
{
	public List<ClientModel> findAll();
	public ClientModel findBy(int id);
	public boolean deleteBy(int id);
	public ClientModel update(ClientModel clientModel);
	
}
