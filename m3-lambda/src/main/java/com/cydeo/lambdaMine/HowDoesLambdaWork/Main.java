package com.cydeo.lambdaMine.HowDoesLambdaWork;

import java.util.function.Predicate;

public class Main {
    //=============How does Lambda works==================
    Predicate<Integer> pred = (p) -> p%2 == 0? true: false;
    //                                -------This Part------

    // implementation for the  abstract method belongs to that
    // functional interface

    //IQ: How does Lambda works?
    // When I write my Lambda Expression I'm putting my implementation that belongs to
    // that function interface abstract method and not to able to find that interface
    // I need to check my method signature whenever method signature is matching with the
    // abstract method signature, I can use that function interface by the way let me explain also
    //What is functional interface?
    //Functional interface is an interface accept only one abstract method

}
