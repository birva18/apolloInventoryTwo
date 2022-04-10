package com.apollo.inventory.one.apolloInventoryOne.service;

import com.apollo.inventory.one.apolloInventoryOne.entity.Center;
import com.apollo.inventory.one.apolloInventoryOne.repository.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class CenterService {

    @Autowired
    private CenterRepository centerRepository;

    public void addCenter(Center center)
    {
        center.setId(0);
        centerRepository.save(center);
    }

    public List<Center> getAllCenters()
    {
        List<Center> centers=centerRepository.findAll();
        return  centers;
    }
}
