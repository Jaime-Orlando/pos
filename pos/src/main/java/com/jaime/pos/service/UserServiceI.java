package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.UserModel;

public interface UserServiceI 
{
	public List<UserModel> findAll();
	public UserModel findBy(int id);
	public boolean deleteBy(int id);
	public UserModel update(UserModel userModel);
}
