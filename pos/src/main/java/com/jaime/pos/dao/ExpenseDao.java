package com.jaime.pos.dao;

import com.jaime.pos.model.ExpenseModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExpenseDao 
{
	public void save(ExpenseModel expenseModel){}
    public List<ExpenseModel> findAll()
    {
        return null;
    }

    public ExpenseModel findBy(int id)
    {
        return null;
    }

    public ExpenseModel update(ExpenseModel expenseModel)
    {
        return null;
    }

    public boolean deleteBy(int id)
    {
        return false;
    }
}
