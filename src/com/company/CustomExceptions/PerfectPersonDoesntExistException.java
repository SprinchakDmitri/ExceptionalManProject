package com.company.CustomExceptions;

public class PerfectPersonDoesntExistException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return  "Perfect person doesn't exist exception. Stop believing in fairy tales";

}}
