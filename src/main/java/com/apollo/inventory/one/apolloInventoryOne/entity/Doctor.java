package com.apollo.inventory.one.apolloInventoryOne.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.*;
import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id",  resolver = EntityIdResolver.class,
        scope=Doctor.class)
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(Rx.class)
    private int id;

    private String name;

    private String contactNumber;

    private boolean partTime;


    @JsonBackReference
    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name="center_id")
    private Center center;

    @ManyToMany(fetch=FetchType.EAGER,cascade={CascadeType.MERGE})
    @JoinTable(name="doctor_patient", joinColumns = @JoinColumn(name="doctor_id"), inverseJoinColumns = @JoinColumn(name="patient_id"))
    private List<Patient> patients;

    public Doctor()
    {

    }


    public Center getCenter() {
        return center;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void setCenter(Center center) {
        this.center = center;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isPartTime() {
        return partTime;
    }

    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }
}
