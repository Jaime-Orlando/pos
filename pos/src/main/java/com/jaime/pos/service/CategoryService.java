package com.jaime.pos.service;

import com.jaime.pos.dao.CategoryDao;
import com.jaime.pos.model.CategoryModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService implements  CategoryServiceI
{

    private final CategoryDao categoryDao;
    @Override
    public void save(CategoryModel categoryModel) {

    }

    @Override
    public List<CategoryModel> findAll() {
        List<CategoryModel> categoryModels = new ArrayList<>();
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(1);
        categoryModel.setDescription("Entertainment Content");
        categoryModel.setName("Entertainment");
        categoryModels.add(categoryModel);
        return categoryModels;
    }

    @Override
    public CategoryModel findBy(int id) {
        return null;
    }

    @Override
    public boolean deleteBy(int id) {
        return false;
    }

    @Override
    public CategoryModel update(CategoryModel categoryModel) {
        return null;
    }


}
