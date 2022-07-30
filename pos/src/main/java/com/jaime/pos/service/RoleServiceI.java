package com.jaime.pos.service;

import java.util.List;
import com.jaime.pos.model.RoleModel;
import com.jaime.pos.model.RoleView;

public interface RoleServiceI
{
	void save(RoleModel roleModel);
	List<RoleModel> findAll();
	List<RoleModel> findAll_();
	RoleView findBy(int id);
	RoleModel update(RoleModel roleModel);
	boolean deleteBy(int id);
}
