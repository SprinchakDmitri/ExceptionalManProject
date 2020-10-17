package com.company.CustomExceptions;

public class SportException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return "\u2620" + " Sport Exception. One of you is a lazy fat person";
    }
}
