package com.apollo.inventory.one.apolloInventoryOne.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.*;

@Entity
public class Center {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String city;

@JsonManagedReference
@OneToMany(mappedBy="center")
private List<Doctor> doctors;

   public Center()
   {

   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
