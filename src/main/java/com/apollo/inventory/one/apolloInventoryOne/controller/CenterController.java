package com.apollo.inventory.one.apolloInventoryOne.controller;


import com.apollo.inventory.one.apolloInventoryOne.entity.Center;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.CenterNotFoundException;
import com.apollo.inventory.one.apolloInventoryOne.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/apolloInventoryOne")
public class CenterController {

    @Autowired
    private CenterService centerService;

    @PostMapping("/center")
    public Center addCenter(@RequestBody Center center)
    {
        centerService.addCenter(center);
        return  center;
    }

    @GetMapping("/centers")
    public List<Center> getAllCenters()
    {
        List<Center> centers=centerService.getAllCenters();
        if(centers.size()==0)
            throw new CenterNotFoundException("No centers available");
        return centers;
    }
}
