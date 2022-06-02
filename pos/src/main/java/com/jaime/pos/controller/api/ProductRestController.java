package com.jaime.pos.controller.api;

import com.jaime.pos.service.ProductServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.jaime.pos.model.ProductModel;

import java.text.MessageFormat;
import java.util.List;

@RestController
@AllArgsConstructor // Alternativa a Autowired
@RequestMapping("/product/")
public class ProductRestController
{
    private final ProductServiceI productService;

    @GetMapping(value = "list")
    @ResponseBody
    public List<ProductModel> read()
    {
        return productService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Product OK";
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
