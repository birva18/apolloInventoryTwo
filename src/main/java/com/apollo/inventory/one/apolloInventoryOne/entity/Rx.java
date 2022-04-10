package com.apollo.inventory.one.apolloInventoryOne.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Rx implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="description")
    private String description;
    @Column(name="prescribedOn")
    private Date prescribedOn;

    //@JsonIdentityReference(alwaysAsId = true)
    @OneToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name="doctor_id")

    private Doctor doctor;


    //@JsonIdentityReference(alwaysAsId = true)
    @OneToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name="patient_id")
    private Patient patient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPrescribedOn() {
        return prescribedOn;
    }

    public void setPrescribedOn(Date prescribedOn) {
        this.prescribedOn = prescribedOn;
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
