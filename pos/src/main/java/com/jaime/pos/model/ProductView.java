package com.jaime.pos.model;
import lombok.Data;

@Data
public class ProductView {

    private int id;
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
