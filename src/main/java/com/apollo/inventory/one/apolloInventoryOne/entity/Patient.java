package com.apollo.inventory.one.apolloInventoryOne.entity;

import com.apollo.inventory.one.apolloInventoryOne.security.AttributeEncryptor;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.*;
import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id",  resolver = EntityIdResolver.class,
        scope=Patient.class)
public class Patient {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;

private String phoneNumber;

@Convert(converter = AttributeEncryptor.class)
private String address;


@ManyToMany(fetch=FetchType.EAGER,cascade={CascadeType.MERGE})
@JoinTable(name="doctor_patient", joinColumns = @JoinColumn(name="patient_id"), inverseJoinColumns = @JoinColumn(name="doctor_id"))
private List<Doctor> doctors;


    public List<Doctor> getDoctors() {
        return doctors;
    }
    public Patient()
    {}

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
