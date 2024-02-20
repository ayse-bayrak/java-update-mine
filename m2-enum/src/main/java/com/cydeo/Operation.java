package com.cydeo;

public enum Operation {
    PLUS, MINUS, MULTIPLY, DIVIDE;
    // each constant is object (new) of Operation Class
    // When this Operation Class is loading this constructor executed for each of them
    // new keyword is executing the Constructor. That's why we see 4 Constructor in the output via main running
    Operation() {
        System.out.println("Constructor");
    }

    // we can write method with the same name (Operation) as well
    // but it si not so common, in the application world, you never gonna write some business
    //logic method inside the inner the maximum you're gonna write it in the enum.
}
