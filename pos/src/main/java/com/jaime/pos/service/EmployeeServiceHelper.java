package com.jaime.pos.service;

import org.springframework.beans.BeanUtils;

import com.jaime.pos.model.EmployeeModel;
import com.jaime.pos.model.EmployeeView;

public class EmployeeServiceHelper 
{
	public static EmployeeView convertModelToView(EmployeeModel employeeModel) 
	{
		EmployeeView employeeView = new EmployeeView();
		BeanUtils.copyProperties(employeeModel, employeeView);
		return employeeView;
	}
}
