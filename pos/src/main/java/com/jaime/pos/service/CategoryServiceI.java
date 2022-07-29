package com.jaime.pos.service;

import com.jaime.pos.model.CategoryModel;
import com.jaime.pos.model.CategoryView;

import java.util.List;

public interface CategoryServiceI
{
    public List<CategoryModel> findAll();
    List<CategoryModel> findAll_();
    public CategoryView findBy(int id);
    public boolean deleteBy(int id);
    public CategoryModel update(CategoryModel categoryModel);
    void save(CategoryModel categoryModel);
	
}
