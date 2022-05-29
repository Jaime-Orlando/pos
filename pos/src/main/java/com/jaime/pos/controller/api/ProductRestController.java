package com.jaime.pos.controller.api;

import com.jaime.pos.model.ProductModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product/")
public class ProductRestController
{

    @GetMapping(value = "list")
    @ResponseBody
    public List<ProductModel> read()
    {
        List<ProductModel> list = new ArrayList<>();
        ProductModel productModel = new ProductModel();
        productModel.setId(1);
        productModel.setBarCode("12345667");
        productModel.setDescription("A product that does something");
        productModel.setCategoryId(2);
        productModel.setName("Chocolate");
        productModel.setImgUri("Here goes the Image Uri");
        productModel.setMinStock(9);
        productModel.setInStock(2);
        productModel.setSku("123562RTX");
        list.add(productModel);

        return list;
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "OK";
    }

    @GetMapping("delete/{productId}")
    @ResponseBody
    public String delete(@PathVariable int productId)
    {
        return MessageFormat.format("Successfully deleted Product with id {0}", productId);
    }
    @PostMapping("new")
    @ResponseBody
    public ProductModel create(@ModelAttribute ProductModel productModel)
    {
        return productModel;
    }

    @PostMapping("update")
    @ResponseBody
    public ProductModel update(@ModelAttribute ProductModel productModel)
    {
        return productModel;
    }
}
