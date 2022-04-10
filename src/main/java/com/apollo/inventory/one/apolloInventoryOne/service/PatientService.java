package com.apollo.inventory.one.apolloInventoryOne.service;

import com.apollo.inventory.one.apolloInventoryOne.entity.Patient;
import com.apollo.inventory.one.apolloInventoryOne.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Service
public class PatientService {

@Autowired
    private PatientRepository patientRepository;

public void addPatient(Patient patient)
{
    patient.setId(0);
    patientRepository.save(patient);

}

public List<Patient> getAllPatients()
{
    List<Patient> patients=patientRepository.findAll();
    return patients;

}


public Patient getPatientById(int id)
{
Patient patient= patientRepository.findById(id).get();
return patient;

}

}
