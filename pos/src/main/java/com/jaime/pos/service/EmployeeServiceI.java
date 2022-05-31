package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.EmployeeModel;

public interface EmployeeServiceI
{
	public List<EmployeeModel> findAll();
	public EmployeeModel findBy(int id);
	public boolean deleteBy(int id);
	public EmployeeModel update(EmployeeModel employeeModel);
}
