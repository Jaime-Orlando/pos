package com.jaime.pos.controller.api;

import com.jaime.pos.model.StoreModel;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/")
public class StoreRestController
{

    @GetMapping("list")
    @ResponseBody
    public List<StoreModel> read()
    {
        List<StoreModel> stores = new ArrayList<>();
        StoreModel store = new StoreModel();
        store.setAddress("Bellevue 34");
        store.setId(2);
        store.setManagerId(3);
        store.setName("BELLEVUE POINT 1");
        stores.add(store);
        return stores;
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
