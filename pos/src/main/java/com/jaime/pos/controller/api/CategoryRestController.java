package com.jaime.pos.controller.api;

import com.jaime.pos.model.CategoryModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category/")
public class CategoryRestController
{

    @GetMapping("list" )
    @ResponseBody
    public List<CategoryModel> read()
    {
        List<CategoryModel> categoryModels = new ArrayList<>();
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(1);
        categoryModel.setDescription("Entertainment Content");
        categoryModel.setName("Entertainment");
        categoryModels.add(categoryModel);
        return categoryModels;
    }

    @GetMapping("delete/{categoryId}")
    @ResponseBody
    public String delete(@PathVariable int categoryId)
    {
        return MessageFormat.format("Successfully deleted category with id {0}", categoryId);
    }

    @PostMapping("new")
    @ResponseBody
    public CategoryModel create(@ModelAttribute CategoryModel categoryModel){
        return categoryModel;
    }

    @PostMapping("update")
    @ResponseBody
    public CategoryModel update(@ModelAttribute CategoryModel categoryModel){
        return categoryModel;
    }

}
