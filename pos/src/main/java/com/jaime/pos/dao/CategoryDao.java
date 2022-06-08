package com.jaime.pos.dao;

import com.jaime.pos.model.CategoryModel;
import com.jaime.pos.model.ProductModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDao 
{
    public void save(CategoryModel categoryModel)
    {

    }

    public List<CategoryModel> findAll()
    {
        return null;
    }

    public ProductModel findBy(int id)
    {
        return null;
    }

    public boolean deleteBy(int id)
    {
        return false;
    }
}
