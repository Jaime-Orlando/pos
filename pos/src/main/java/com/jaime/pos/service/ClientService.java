package com.jaime.pos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.ClientModel;

@Service
public class ClientService implements ClientServiceI 
{

	@Override
	public List<ClientModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientModel findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBy(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClientModel update(ClientModel clientModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
