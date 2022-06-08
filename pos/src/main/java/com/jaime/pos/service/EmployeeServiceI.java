package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.EmployeeModel;

public interface EmployeeServiceI
{
	void save(EmployeeModel employeeModel);
	List<EmployeeModel> findAll();
	EmployeeModel findBy(int id);
	EmployeeModel update(EmployeeModel employeeModel);
	boolean deleteBy(int id);
}
