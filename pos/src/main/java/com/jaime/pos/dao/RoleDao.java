package com.jaime.pos.dao;

import com.jaime.pos.model.RoleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<RoleModel, Integer>
{
}
