package com.jaime.pos.service;

import java.util.List;
import com.jaime.pos.model.ExpenseModel;
import com.jaime.pos.model.ExpenseView;

public interface ExpenseServiceI 
{
	void save(ExpenseModel expenseModel);
	List<ExpenseModel> findAll();
	List<ExpenseModel> findAll_();
	ExpenseView findBy(int id);
	boolean deleteBy(int id);
	ExpenseModel update(ExpenseModel expenseModel);


}
