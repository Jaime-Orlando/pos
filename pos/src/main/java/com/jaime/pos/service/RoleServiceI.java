package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.RoleModel;

public interface RoleServiceI
{
	public List<RoleModel> findAll();
	public RoleModel findBy(int id);
	public boolean deleteBy(int id);
	public RoleModel update(RoleModel roleModel);
}
