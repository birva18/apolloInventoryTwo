package com.apollo.inventory.one.apolloInventoryOne.repository;

import com.apollo.inventory.one.apolloInventoryOne.entity.Rx;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RxRepository extends JpaRepository<Rx, Integer> {

//    Select doctor_id from doctor_patient d Where d.patient_id=(select id from Patient where id=4);


}
