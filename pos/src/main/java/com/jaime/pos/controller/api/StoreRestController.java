package com.jaime.pos.controller.api;

import com.jaime.pos.model.StoreModel;
import com.jaime.pos.service.StoreServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/store/")
public class StoreRestController
{

    private final StoreServiceI storeService;
    @GetMapping("list")
    @ResponseBody
    public List<StoreModel> read()
    {
        return storeService.findAll();
    }

    @GetMapping("list/running")
    @ResponseBody
    public String init()
    {
        return "Store OK";
    }

    @GetMapping("delete/{storeId}")
    @ResponseBody
    public String delete(@PathVariable int storeId)
    {
        return MessageFormat.format("Successfully deleted store with ID: {0}", storeId);
    }

    @PostMapping("new")
    @ResponseBody
    public StoreModel create(@ModelAttribute StoreModel storeModel)
    {
        return storeModel;
    }

    @PostMapping("update")
    @ResponseBody
    public StoreModel update(@ModelAttribute StoreModel storeModel)
    {
        return storeModel;
    }

}
