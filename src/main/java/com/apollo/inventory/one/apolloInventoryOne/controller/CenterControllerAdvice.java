package com.apollo.inventory.one.apolloInventoryOne.controller;


import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.CenterErrorResponse;
import com.apollo.inventory.one.apolloInventoryOne.exceptionHandling.CenterNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.DispatcherServlet;

@ControllerAdvice
public class CenterControllerAdvice {

@ExceptionHandler
public ResponseEntity<CenterErrorResponse> handleException(CenterNotFoundException centerNotFoundException)
{
CenterErrorResponse centerErrorResponse=new CenterErrorResponse();
centerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
centerErrorResponse.setMessage(centerNotFoundException.getMessage());
centerErrorResponse.setTimestamp(System.currentTimeMillis());
return new ResponseEntity<>(centerErrorResponse, HttpStatus.BAD_REQUEST);

}

    @ExceptionHandler
    public ResponseEntity<CenterErrorResponse> handleException(Exception centerNotFoundException)
    {
        CenterErrorResponse centerErrorResponse=new CenterErrorResponse();
        centerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        centerErrorResponse.setMessage(centerNotFoundException.getMessage());
        centerErrorResponse.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(centerErrorResponse, HttpStatus.BAD_REQUEST);

    }


}
