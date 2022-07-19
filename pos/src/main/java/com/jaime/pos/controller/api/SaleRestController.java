package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.SaleForm;
import com.jaime.pos.model.SaleModel;
import com.jaime.pos.service.SaleServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/sale/")
public class SaleRestController
{

    private final SaleServiceI saleService;

    @PostMapping("new")
    @ResponseBody
    public SaleModel create(@RequestBody SaleForm saleForm)
    {
        SaleModel saleModel = convertToSaleModel(saleForm);
        saleService.save(saleModel);
        return saleModel;
    }

    private SaleModel convertToSaleModel(SaleForm saleForm)
    {
        SaleModel saleModel = new SaleModel();
        saleModel.setId(saleForm.getId());
        saleModel.setDetailId(saleForm.getDetailId());
        saleModel.setEmployeeId(saleForm.getEmployeeId());
        saleModel.setDiscount(saleForm.getDiscount());
        saleModel.setAmount(saleForm.getAmount());
        saleModel.setCurrency(saleForm.getCurrency());
        saleModel.setClientId(saleForm.getClientId());
        saleModel.setTax(saleForm.getTax());
        saleModel.setObservations(saleForm.getObservations());
        saleModel.setStoreId(saleForm.getStoreId());
        saleModel.setDate(saleForm.getDate());
        return saleModel;
    }

    @GetMapping("list")
    @ResponseBody
    public List<SaleModel> read()
    {
        return saleService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Sale OK";
    }

    @PostMapping("update")
    @ResponseBody
    public SaleModel update(@ModelAttribute SaleModel saleModel)
    {
        return saleModel;
    }

    @GetMapping("delete/{saleId}")
    @ResponseBody
    public String delete(@PathVariable int saleId)
    {
        return MessageFormat.format("Successfully deleted sale with ID: {0}", saleId);
    }

}
