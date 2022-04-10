package com.apollo.inventory.one.apolloInventoryOne.repository;

import com.apollo.inventory.one.apolloInventoryOne.entity.Doctor;
import com.apollo.inventory.one.apolloInventoryOne.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.*;
public interface PatientRepository extends JpaRepository<Patient, Integer> {


}
