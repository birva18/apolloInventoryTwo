package com.apollo.inventory.one.apolloInventoryOne.service;

import com.apollo.inventory.one.apolloInventoryOne.dto.RxDTO;
import com.apollo.inventory.one.apolloInventoryOne.entity.Doctor;
import com.apollo.inventory.one.apolloInventoryOne.entity.Patient;
import com.apollo.inventory.one.apolloInventoryOne.entity.Rx;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.DoctorNotFoundException;
import com.apollo.inventory.one.apolloInventoryOne.repository.DoctorRepository;
import com.apollo.inventory.one.apolloInventoryOne.repository.PatientRepository;
import com.apollo.inventory.one.apolloInventoryOne.repository.RxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;

@Service
public class RxService {

    @Autowired
    private RxRepository rxRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;


    public void addRx(RxDTO rxdto)
    {
     Rx rx=rxdto.getRx();
     rx.setId(0);

     Doctor doctor=rxdto.getDoctor();
     Patient patient= rxdto.getPatient();

     List<Patient> patients=doctor.getPatients();
     int b=patients.indexOf(patient);

     if(b!=-1) {
         rx.setDoctor(rxdto.getDoctor());
         rx.setPatient(rxdto.getPatient());
         rxRepository.save(rx);
     } else throw new DoctorNotFoundException("Doctor/Patient with id does not exist");
    }


    public Rx getRxByID(int id)
    {
        Rx rx=rxRepository.getById(id);
        return rx;
    }
}
