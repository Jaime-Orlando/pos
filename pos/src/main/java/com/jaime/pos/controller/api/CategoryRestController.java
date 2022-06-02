package com.jaime.pos.controller.api;

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
