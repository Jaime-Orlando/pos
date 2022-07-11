package com.jaime.pos.dao;

import com.jaime.pos.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<UserModel, Integer>
{
}
