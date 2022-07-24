package com.jaime.pos.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.jaime.pos.dao.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jaime.pos.model.UserModel;

@Service
@AllArgsConstructor
public class UserService implements UserServiceI
{
	private final UserDao userDao;
	@Override
	public void save(UserModel userModel) 
	{
		userDao.save(userModel);
	}
	
	@Override
	public List<UserModel> findAll()
	{
		return (List<UserModel>) userDao.findAll();
	}

	@Override
	public List<UserModel> findAll_()
	{
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
	public UserModel findBy(int id) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public UserModel update(UserModel userModel) 
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
