package com.jaime.pos.model;

import lombok.Data;

@Data
public class ProductListForm
{
	String page;
	String pageSize;
	String sortDesc;
}
