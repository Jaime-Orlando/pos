package com.jaime.pos.service;

import org.springframework.beans.BeanUtils;

import com.jaime.pos.model.CategoryModel;
import com.jaime.pos.model.CategoryView;

public class CategoryServiceHelper 
{
	public static CategoryView convertModelToView(CategoryModel categoryModel) 
	{
		CategoryView categoryView = new CategoryView();
		BeanUtils.copyProperties(categoryModel, categoryView);
		return categoryView;
	}
}
