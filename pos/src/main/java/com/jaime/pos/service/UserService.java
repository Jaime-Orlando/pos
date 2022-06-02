package com.jaime.pos.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.UserModel;

@Service
public class UserService implements UserServiceI
{

	@Override
	public List<UserModel> findAll() {
		List<UserModel> users = new ArrayList<>();
		UserModel user = new UserModel();
		user.setId(2);
		user.setName("ben.freddy");
		user.setLastAccess(LocalDateTime.now());
		user.setRoleId(2);
		users.add(user);
		return users;
	}

	@Override
	public UserModel findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBy(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserModel update(UserModel userModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
