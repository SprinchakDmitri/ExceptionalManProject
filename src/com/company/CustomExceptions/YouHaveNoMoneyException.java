package com.company.CustomExceptions;



public class YouHaveNoMoneyException extends IllegalArgumentException {
    @Override
    public String toString() {
        return "You have no money exception.\nLooks like it's time to change 100 euro";
    }
}
