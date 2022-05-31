package com.jaime.pos.service;

import java.util.List;

import com.jaime.pos.model.ExpenseModel;

public interface ExpenseServiceI 
{
	public List<ExpenseModel> findAll();
	public ExpenseModel findBy(int id);
	public boolean deleteBy(int id);
	public ExpenseModel update(ExpenseModel expenseModel);
}
