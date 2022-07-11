package com.jaime.pos.dao;

import com.jaime.pos.model.ExpenseModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseDao extends CrudRepository<ExpenseModel, Integer>
{
	
}
