package com.apollo.inventory.one.apolloInventoryOne.exceptionHandling;

public class PatientNotFoundException extends RuntimeException{

public PatientNotFoundException(String message)
{
super(message);
}

public PatientNotFoundException(String message, Throwable cause) {
    super(message, cause);
}


public PatientNotFoundException(Throwable cause)
{
    super(cause);
}


}
