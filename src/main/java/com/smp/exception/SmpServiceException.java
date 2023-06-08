package com.smp.exception;

import lombok.Getter;

@Getter
public class SmpServiceException extends RuntimeException{
    private final ErrorType errorType;

    public SmpServiceException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public SmpServiceException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }



}
