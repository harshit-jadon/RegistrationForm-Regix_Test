package com.bridgelabz.registrationform;

@FunctionalInterface
public interface IValidateLambda {
    boolean validateInput(String input, String regEx);

}
