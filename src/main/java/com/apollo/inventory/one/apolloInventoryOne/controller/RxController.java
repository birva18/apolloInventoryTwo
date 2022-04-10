package com.apollo.inventory.one.apolloInventoryOne.controller;

import com.apollo.inventory.one.apolloInventoryOne.dto.RxDTO;
import com.apollo.inventory.one.apolloInventoryOne.entity.Rx;
import com.apollo.inventory.one.apolloInventoryOne.service.RxService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/apolloInventoryOne")
public class RxController {

    @Autowired
    private RxService rxService;

    @PostMapping("/rx")
    public RxDTO addRx(@RequestBody RxDTO rxDto)
    {
      rxService.addRx(rxDto);
      return rxDto;
    }


    @GetMapping("rx/{rxId}")
    public Rx getRx(@PathVariable int rxId)
    {
        Rx rx=rxService.getRxByID(rxId);
        return rx;
    }
}
