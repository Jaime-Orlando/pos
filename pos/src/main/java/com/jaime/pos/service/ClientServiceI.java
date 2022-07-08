package com.jaime.pos.service;

import java.util.List;
import com.jaime.pos.model.ClientModel;

public interface ClientServiceI
{
	void save(ClientModel clientModel);
	List<ClientModel> findAll();
	List<ClientModel> findAll_();
	ClientModel findBy(int id);
	ClientModel update(ClientModel clientModel);
	boolean deleteBy(int id);
}
