package com.jaime.pos.service;

import java.util.ArrayList;
import java.util.List;
import com.jaime.pos.dao.RoleDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jaime.pos.model.RoleModel;

@Service
@AllArgsConstructor
public class RoleService implements RoleServiceI
{

	private final RoleDao roleDao;

	@Override
	public void save(RoleModel roleModel)
	{

	}
	
	@Override
	public List<RoleModel> findAll() 
	{
		return (List<RoleModel>)roleDao.findAll();
	}

	@Override
	public List<RoleModel> findAll_() {
		List<RoleModel> roles = new ArrayList<>();
		RoleModel role = new RoleModel();
		role.setId(1);
		role.setName("Administrator");
		role.setDescription("Has all privileges");
		roles.add(role);
		return roles;
	}

	@Override
	public RoleModel findBy(int id) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public RoleModel update(RoleModel roleModel) 
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
