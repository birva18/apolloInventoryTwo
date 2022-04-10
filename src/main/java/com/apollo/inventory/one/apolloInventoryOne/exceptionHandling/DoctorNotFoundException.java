package com.apollo.inventory.one.apolloInventoryOne.exceptionHandling;

public class DoctorNotFoundException extends RuntimeException{

public DoctorNotFoundException(String message)
{
super(message);
}

public DoctorNotFoundException(String message, Throwable cause) {
    super(message, cause);
}


public DoctorNotFoundException(Throwable cause)
{
    super(cause);
}


}
