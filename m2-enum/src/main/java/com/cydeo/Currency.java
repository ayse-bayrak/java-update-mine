package com.cydeo;

public enum Currency {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    // PENNY is an constant object from Currency Class
    // NICKLE, DIME, QUARTER are constant objects from Currency Class
    //This is how we are assigning value to constructor

    private int value;
    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // This is everything you need to know, this is how the real usage Enum in the application
}
