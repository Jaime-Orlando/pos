package com.jaime.pos.service;

import java.util.List;
import com.jaime.pos.model.UserModel;

public interface UserServiceI 
{
	void save(UserModel userModel);
	List<UserModel> findAll();
	List<UserModel> findAll_();
	UserModel findBy(int id);
	UserModel update(UserModel userModel);
	boolean deleteBy(int id);
}
