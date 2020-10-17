package com.company.CustomExceptions;

public class IntrovertException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return "\u2639" +" Introvert exception. You will probably be bored together ";
    }
}
