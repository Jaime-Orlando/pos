package com.jaime.pos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaime.pos.model.ExpenseModel;

@Service
public class ExpenseService implements ExpenseServiceI
{

	@Override
	public List<ExpenseModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExpenseModel findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBy(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ExpenseModel update(ExpenseModel expenseModel) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
