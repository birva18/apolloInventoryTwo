package com.apollo.inventory.one.apolloInventoryOne.exceptionHandling;

import com.apollo.inventory.one.apolloInventoryOne.service.CenterService;

public class CenterNotFoundException extends RuntimeException{

public CenterNotFoundException(String message)
{
super(message);
}

public CenterNotFoundException(String message, Throwable cause) {
    super(message, cause);
}


public CenterNotFoundException(Throwable cause)
{
    super(cause);
}


}
