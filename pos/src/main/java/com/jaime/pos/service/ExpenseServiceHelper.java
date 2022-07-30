package com.jaime.pos.service;

import org.springframework.beans.BeanUtils;

import com.jaime.pos.model.ExpenseModel;
import com.jaime.pos.model.ExpenseView;

public class ExpenseServiceHelper 
{
	public static ExpenseView convertModelToView(ExpenseModel expenseModel) 
	{
		ExpenseView expenseView = new ExpenseView();
		BeanUtils.copyProperties(expenseModel, expenseView);
		return expenseView;
	}
}
