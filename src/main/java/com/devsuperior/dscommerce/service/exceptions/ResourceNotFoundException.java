package com.devsuperior.dscommerce.service.exceptions;

import javax.print.DocFlavor.STRING;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg){
        super(msg);


    }
}