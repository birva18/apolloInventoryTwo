package com.apollo.inventory.one.apolloInventoryOne.controller;


import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.CenterErrorResponse;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.CenterNotFoundException;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.PatientErrorResponse;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.PatientNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PatientControllerAdvice {

@ExceptionHandler
public ResponseEntity<PatientErrorResponse> handleException(PatientNotFoundException patientNotFoundException)
{
PatientErrorResponse patientErrorResponse=new PatientErrorResponse();
patientErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
patientErrorResponse.setMessage(patientNotFoundException.getMessage());
patientErrorResponse.setTimestamp(System.currentTimeMillis());
return new ResponseEntity<>(patientErrorResponse, HttpStatus.BAD_REQUEST);

}

    @ExceptionHandler
    public ResponseEntity<PatientErrorResponse> handleException(Exception patientNotFoundException)
    {
        PatientErrorResponse patientErrorResponse=new PatientErrorResponse();
        patientErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        patientErrorResponse.setMessage(patientNotFoundException.getMessage());
        patientErrorResponse.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(patientErrorResponse, HttpStatus.BAD_REQUEST);

    }


}
