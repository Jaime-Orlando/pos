package com.jaime.pos.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.EmployeeModel;

@Service
public class EmployeeService implements EmployeeServiceI
{

	@Override
	public List<EmployeeModel> findAll() {
		List<EmployeeModel> employees = new ArrayList<>();
		EmployeeModel employee = new EmployeeModel();
		employee.setId(1);
		employee.setBirthdate(LocalDate.of(1990,11,12));
		employee.setEmail("alicia.ch@fl.com");
		employee.setFirstName("Alicia");
		employee.setPhone("336435677");
		employee.setLastName("Chávez");
		employee.setRfc("124234");
		employee.setStoreId(1);
		employee.setUserId(1);
		employees.add(employee);
		return employees;
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
