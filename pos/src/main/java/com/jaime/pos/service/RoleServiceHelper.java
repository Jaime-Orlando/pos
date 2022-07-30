package com.jaime.pos.service;

import org.springframework.beans.BeanUtils;

import com.jaime.pos.model.RoleModel;
import com.jaime.pos.model.RoleView;

public class RoleServiceHelper 
{
	public static RoleView convertModelToView(RoleModel roleModel) 
	{
		RoleView roleView = new RoleView();
		BeanUtils.copyProperties(roleModel, roleView);
		return roleView;
	}
}
