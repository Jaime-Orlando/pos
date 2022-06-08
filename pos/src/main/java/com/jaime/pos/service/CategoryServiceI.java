package com.jaime.pos.service;

import com.jaime.pos.model.CategoryModel;

import java.util.List;

public interface CategoryServiceI
{
    public List<CategoryModel> findAll();
    public CategoryModel findBy(int id);
    public boolean deleteBy(int id);
    public CategoryModel update(CategoryModel categoryModel);

    void save(CategoryModel categoryModel);
}
