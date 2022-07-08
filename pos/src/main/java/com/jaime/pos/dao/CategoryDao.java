package com.jaime.pos.dao;
import com.jaime.pos.model.CategoryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends CrudRepository<CategoryModel, Integer>
{
    
}
