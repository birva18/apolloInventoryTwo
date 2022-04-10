package com.apollo.inventory.one.apolloInventoryOne.controller;


import com.apollo.inventory.one.apolloInventoryOne.entity.Patient;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.PatientNotFoundException;
import com.apollo.inventory.one.apolloInventoryOne.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/apolloInventoryOne")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patient")
    public Patient addPatient(@RequestBody Patient patient)
    {
        patientService.addPatient(patient);
        return patient;
    }


    @GetMapping("/patients")
    public List<Patient> getALlPatients()
    {
        List<Patient> patients=patientService.getAllPatients();
        if(patients.size()==0)
            throw new PatientNotFoundException("Patient details not available");
        return patients;

    }

    @GetMapping("/patients/{patientId}")
    public Patient getPatient(@PathVariable int patientId)
    {
       Patient patient=patientService.getPatientById(patientId);
       if(patient==null)
            throw  new PatientNotFoundException("Patient with "+patientId+" does not exist");
       return patient;
    }
}
