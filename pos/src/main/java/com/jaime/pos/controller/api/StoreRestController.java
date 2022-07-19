package com.jaime.pos.controller.api;

import com.jaime.pos.controller.api.form.StoreForm;
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
    @PostMapping("new")
    @ResponseBody
    public StoreModel create(@RequestBody StoreForm storeForm)
    {
        StoreModel storeModel = convertToStoreModel(storeForm);
        storeService.save(storeModel);
        return storeModel;
    }

    private StoreModel convertToStoreModel(StoreForm storeForm)
    {
        StoreModel storeModel = new StoreModel();
        storeModel.setId(storeForm.getId());
        storeModel.setName(storeForm.getName());
        storeModel.setManagerId(storeForm.getManagerId());
        storeModel.setAddress(storeForm.getAddress());
        return storeModel;
    }

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

    @PostMapping("update")
    @ResponseBody
    public StoreModel update(@ModelAttribute StoreModel storeModel)
    {
        return storeModel;
    }

    @GetMapping("delete/{storeId}")
    @ResponseBody
    public String delete(@PathVariable int storeId)
    {
        return MessageFormat.format("Successfully deleted store with ID: {0}", storeId);
    }


}
