package com.cydeo.genericMine;

public interface GenericInterface<T> {
    void function (T i);

    //void function (int i);
    // we create abstract method that takes int argument and return no value
    //So we could use this method whenever we need to create a function that takes an integer
    // and does not return a value
    // what if I want to make sure that this my custom functional interface can work with any type,
    //not only for this integers, therefore i need to apply the generic to be able to use this function
    // work with other type
}
