package com.jaime.pos.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.jaime.pos.dao.SaleDao;
import com.jaime.pos.model.Currency;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jaime.pos.model.SaleModel;

@Service
@AllArgsConstructor
public class SaleService implements SaleServiceI
{
	private final SaleDao saleDao;

	@Override
	public void save(SaleModel saleModel)
	{

	}
	
	@Override
	public List<SaleModel> findAll() 
	{
		return (List<SaleModel>) saleDao.findAll();
	}

	@Override
	public List<SaleModel> findAll_() 
	{
		List<SaleModel> sales = new ArrayList<>();
		SaleModel sale = new SaleModel();
		sale.setId(1);
		sale.setAmount(2);
		sale.setCurrency(Currency.MXN);
		sale.setDate(LocalDateTime.now());
		sale.setDetailId(1);
		sale.setEmployeeId(1);
		sale.setObservations("NONE");
		sale.setStoreId(1);
		sale.setTax(12.5f);
		sale.setDiscount(5.0f);
		sales.add(sale);
		return sales;
	}

	@Override
	public SaleModel findBy(int id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SaleModel update(SaleModel saleModel) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean deleteBy(int id) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
