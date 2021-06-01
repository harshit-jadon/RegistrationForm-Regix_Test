package com.bridgelabz.exception;

public class RegistrationFormException extends Exception{
    public enum exceptionType{
        Entered_Empty,Entered_Null, Entered_Short, Entered_Invalid
    }
    public exceptionType type;

    public RegistrationFormException(exceptionType type, String message){
        super(message);
        this.type = type;

    }
}
