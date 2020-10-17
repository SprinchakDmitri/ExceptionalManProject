package com.company.CustomExceptions;

public class MoneyException extends Exception{
    @Override
    public String toString() {
        return "\u26D4" + " Money Exception. You can't earn all the money " ;

    }
}
