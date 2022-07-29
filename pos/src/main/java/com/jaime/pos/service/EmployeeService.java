package com.jaime.pos.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.jaime.pos.dao.EmployeeDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jaime.pos.model.EmployeeModel;
import com.jaime.pos.model.EmployeeView;

@Service
@AllArgsConstructor
public class EmployeeService implements EmployeeServiceI
{

	private final EmployeeDao employeeDao;
	@Override
	public void save(EmployeeModel employeeModel)
	{
		employeeDao.save(employeeModel);
	}

	@Override
	public List<EmployeeModel> findAll()
	{
		return (List<EmployeeModel>) employeeDao.findAll();
	}
	
	@Override
	public List<EmployeeModel> findAll_() {
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
	public EmployeeView findBy(int id) {
		EmployeeModel employeeModel = employeeDao.findById(id).get();
		EmployeeView employeeView = EmployeeServiceHelper.convertModelToView(employeeModel);
		return employeeView;
	}

	@Override
	public EmployeeModel update(EmployeeModel employeeModel) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteBy(int id) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
