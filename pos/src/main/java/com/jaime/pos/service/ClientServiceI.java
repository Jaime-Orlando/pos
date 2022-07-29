package com.jaime.pos.service;

import java.util.List;
import com.jaime.pos.model.ClientModel;
import com.jaime.pos.model.ClientView;

public interface ClientServiceI
{
	void save(ClientModel clientModel);
	List<ClientModel> findAll();
	List<ClientModel> findAll_();
	ClientView findBy(int id);
	ClientModel update(ClientModel clientModel);
	boolean deleteBy(int id);
}
