package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.ProductForm;
import com.jaime.pos.service.ProductServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.jaime.pos.model.ProductListForm;
import com.jaime.pos.model.ProductListView;
import com.jaime.pos.model.ProductModel;

import java.text.MessageFormat;
import java.util.List;

@RestController
@AllArgsConstructor // Alternativa a Autowired
@RequestMapping("/product/")
public class ProductRestController
{
    private final ProductServiceI productService;

    @PostMapping("new")
    @ResponseBody
    public ProductModel create(@ModelAttribute ProductForm productForm)
    {
        ProductModel productModel =  convertToProductModel(productForm);
        productService.save(productModel);
        return productModel;
    }

    private ProductModel convertToProductModel(ProductForm productForm)
    {
        ProductModel productModel = new ProductModel();
        productModel.setId(productForm.getId());
        productModel.setName(productForm.getName());
        productModel.setDescription(productForm.getDescription());
        productModel.setPrice(productForm.getPrice());
        productModel.setInStock(productForm.getInStock());
        productModel.setMinStock(productForm.getMinStock());
        productModel.setBarCode(productForm.getBarCode());
        productModel.setSku(productForm.getSku());
        productModel.setImgUri(productForm.getImgUri());
        productModel.setCategoryId(productForm.getCategoryId());
        return productModel;
    }

    @GetMapping("list")
    @ResponseBody
    public ProductListView read(@ModelAttribute ProductListForm productListForm)
    {
    	ProductListView productListView = new ProductListView();
    	productListView.setDescription("This is just a random product list");
    	productListView.setItems(productService.findAll());
    	return productListView;
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Product OK";
    }

    @PostMapping("update")
    @ResponseBody
    public ProductModel update(@ModelAttribute ProductModel productModel)
    {
        return productModel;
    }

    @GetMapping("delete/{productId}")
    @ResponseBody
    public String delete(@PathVariable int productId)
    {
        return MessageFormat.format("Successfully deleted Product with id {0}", productId);
    }

}
