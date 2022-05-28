package com.jaime.pos;

import com.jaime.pos.model.Currency;
import com.jaime.pos.model.SaleModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sale/")
public class SaleController
{

    @GetMapping("list")
    @ResponseBody
    public List<SaleModel> read()
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

    @GetMapping("delete/{saleId}")
    @ResponseBody
    public String delete(@PathVariable int saleId)
    {
        return MessageFormat.format("Successfully deleted sale with ID: {0}", saleId);
    }

    @PostMapping("new")
    @ResponseBody
    public SaleModel create(@ModelAttribute SaleModel saleModel)
    {
        return saleModel;
    }

    @PostMapping("update")
    @ResponseBody
    public SaleModel update(@ModelAttribute SaleModel saleModel)
    {
        return saleModel;
    }
}
