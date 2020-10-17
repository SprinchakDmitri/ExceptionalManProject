package com.company.CustomExceptions;

public class CatsException extends Exception{
    @Override
    public String toString() {
        return "\u274C" + " Cats Exception. Some peoples have allergy to cats ";
    }
}
