package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.CategoryForm;
import com.jaime.pos.model.CategoryModel;
import com.jaime.pos.service.CategoryServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/category/")
public class CategoryRestController
{
    private final CategoryServiceI categoryService;

    @PostMapping("new")
    @ResponseBody
    public CategoryModel create(@ModelAttribute CategoryForm categoryForm)
    {
        CategoryModel categoryModel = convertToCategoryMode(categoryForm);
        categoryService.save(categoryModel);
        return categoryModel;
    }

    private CategoryModel convertToCategoryMode(CategoryForm categoryForm)
    {
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(categoryForm.getId());
        categoryModel.setName(categoryForm.getName());
        categoryModel.setDescription(categoryForm.getDescription());
        return categoryModel;
    }

    @GetMapping("list" )
    @ResponseBody
    public List<CategoryModel> read()
    {
        return categoryService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return("Category OK");
    }

    @PostMapping("update")
    @ResponseBody
    public CategoryModel update(@ModelAttribute CategoryModel categoryModel){
        return categoryModel;
    }


    @GetMapping("delete/{categoryId}")
    @ResponseBody
    public String delete(@PathVariable int categoryId)
    {
        return MessageFormat.format("Successfully deleted category with id {0}", categoryId);
    }



}
