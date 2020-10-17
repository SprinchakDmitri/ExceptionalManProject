package com.company.CustomExceptions;

public class CarException extends Exception {
    @Override
    public String toString() {
        return "\u2622" +" Car exception. It looks like one of you like to walk";
    }
}
