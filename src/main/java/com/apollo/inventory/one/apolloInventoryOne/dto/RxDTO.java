package com.apollo.inventory.one.apolloInventoryOne.dto;

import com.apollo.inventory.one.apolloInventoryOne.entity.Doctor;
import com.apollo.inventory.one.apolloInventoryOne.entity.EntityIdResolver;
import com.apollo.inventory.one.apolloInventoryOne.entity.Patient;
import com.apollo.inventory.one.apolloInventoryOne.entity.Rx;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Component
public class RxDTO {


    private int id;

    private Rx rx;


    @JsonIdentityReference(alwaysAsId = true)
    private Doctor doctor;

    @JsonIdentityReference(alwaysAsId = true)
    private Patient patient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rx getRx() {
        return rx;
    }

    public void setRx(Rx rx) {
        this.rx = rx;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
