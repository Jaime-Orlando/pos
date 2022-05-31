package com.jaime.pos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.EmployeeModel;

@Service
public class EmployeeService implements EmployeeServiceI
{

	@Override
	public List<EmployeeModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeModel findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBy(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeModel update(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
