package com.informatorio.storeinformatorio.controller.exceptions;

public class ForbiddenException extends RuntimeException{

    private static final String DESCRIPTION = "Forbidden Exception (403)";

    public ForbiddenException(String detail){
        super(DESCRIPTION + ". " + detail);
    }

}
