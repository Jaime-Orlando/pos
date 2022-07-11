package com.jaime.pos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jaime.pos.model.EmployeeModel;

@Repository
public interface EmployeeDao extends CrudRepository<EmployeeModel, Integer>
{

}
