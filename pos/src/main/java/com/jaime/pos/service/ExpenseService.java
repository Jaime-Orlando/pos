package com.jaime.pos.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.jaime.pos.model.Currency;
import org.springframework.stereotype.Service;

import com.jaime.pos.model.ExpenseModel;

@Service
public class ExpenseService implements ExpenseServiceI
{

	@Override
	public List<ExpenseModel> findAll() {
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
