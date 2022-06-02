package com.jaime.pos.controller.api;

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
