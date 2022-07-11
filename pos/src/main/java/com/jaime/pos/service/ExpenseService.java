package com.jaime.pos.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.jaime.pos.dao.ExpenseDao;
import com.jaime.pos.model.Currency;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jaime.pos.model.ExpenseModel;

@Service
@AllArgsConstructor
public class ExpenseService implements ExpenseServiceI
{
	private final ExpenseDao expenseDao;

	@Override
	public void save(ExpenseModel expenseModel)
	{

	}
	
	@Override
	public List<ExpenseModel> findAll() 
	{
		return (List<ExpenseModel>) expenseDao.findAll();
	}

	@Override
	public List<ExpenseModel> findAll_() 
	{
		List<ExpenseModel> expenses = new ArrayList<>();
		ExpenseModel expense = new ExpenseModel();
		expense.setAmount(333);
		expense.setId(1);
		expense.setConcept("Shipping");
		expense.setCurrency(Currency.EUR);
		expense.setDate(LocalDateTime.now());
		expense.setEmployeeId(2);
		expense.setStoreId(3);
		expenses.add(expense);
		return expenses;
	}

	@Override
	public ExpenseModel findBy(int id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExpenseModel update(ExpenseModel expenseModel) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteBy(int id) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
