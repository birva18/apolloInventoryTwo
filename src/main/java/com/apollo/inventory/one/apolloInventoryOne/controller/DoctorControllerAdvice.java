package com.apollo.inventory.one.apolloInventoryOne.controller;


import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.CenterErrorResponse;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.CenterNotFoundException;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.DoctorErrorResponse;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.DoctorNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DoctorControllerAdvice {

@ExceptionHandler
public ResponseEntity<DoctorErrorResponse> handleException(DoctorNotFoundException doctorNotFoundException)
{
DoctorErrorResponse doctorErrorResponse=new DoctorErrorResponse();
doctorErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
doctorErrorResponse.setMessage(doctorNotFoundException.getMessage());
doctorErrorResponse.setTimestamp(System.currentTimeMillis());
return new ResponseEntity<>(doctorErrorResponse, HttpStatus.BAD_REQUEST);

}

    @ExceptionHandler
    public ResponseEntity<DoctorErrorResponse> handleException(Exception doctorNotFoundException)
    {
        DoctorErrorResponse doctorErrorResponse=new DoctorErrorResponse();
        doctorErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        doctorErrorResponse.setMessage(doctorNotFoundException.getMessage());
        doctorErrorResponse.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(doctorErrorResponse, HttpStatus.BAD_REQUEST);

    }


}
