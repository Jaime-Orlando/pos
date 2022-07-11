package com.jaime.pos.service;

import java.util.List;
import com.jaime.pos.model.EmployeeModel;

public interface EmployeeServiceI
{
	void save(EmployeeModel employeeModel);
	List<EmployeeModel> findAll();
	List<EmployeeModel> findAll_();
	EmployeeModel findBy(int id);
	EmployeeModel update(EmployeeModel employeeModel);
	boolean deleteBy(int id);
}
