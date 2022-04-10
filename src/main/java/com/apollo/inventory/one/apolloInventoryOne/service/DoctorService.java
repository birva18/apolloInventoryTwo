package com.apollo.inventory.one.apolloInventoryOne.service;

import com.apollo.inventory.one.apolloInventoryOne.entity.Doctor;
import com.apollo.inventory.one.apolloInventoryOne.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DoctorService {


    @Autowired
    private DoctorRepository doctorRepository;

    public void addDoctor(Doctor doctor)
    {
        doctor.setId(0);
        doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors()
    {
        List<Doctor> doctors=doctorRepository.findAll();
        return doctors;
    }

}
