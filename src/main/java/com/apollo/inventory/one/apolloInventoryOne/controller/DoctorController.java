package com.apollo.inventory.one.apolloInventoryOne.controller;

import com.apollo.inventory.one.apolloInventoryOne.entity.Doctor;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.DoctorNotFoundException;
import com.apollo.inventory.one.apolloInventoryOne.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/apolloInventoryOne")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/doctor")
    public Doctor addDoctor(@RequestBody Doctor doctor)
    {
        doctorService.addDoctor(doctor);
        return doctor;
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors()
    {
       List<Doctor> doctors=doctorService.getAllDoctors();
       if(doctors.size()==0)
           throw new DoctorNotFoundException("No doctor present");
       return doctors;
    }
}
