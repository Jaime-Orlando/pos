package com.jaime.pos.controller.api.form;

import lombok.Data;

@Data
public class ProductForm {

    private long id;
    private String name;
    private String description;
    private double price;
    private int inStock;
    private int minStock;
    private String barCode;
    private String sku;
    private String imgUri;
    private int categoryId;

}
