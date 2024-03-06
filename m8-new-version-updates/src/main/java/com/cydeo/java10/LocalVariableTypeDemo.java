package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {

        //Type Inference

        String abc = "Cydeo";
       // "Cydeo"  when we write just like this, compiler understand it is string because  double quarto
        // with Java 10 var (shorten of the variable) came
        //they brought it from Java Script
        // you can mention in it type with only using var
        //No type inference in case of member variable, method parameters, return value, only local variable

        var str = "Cydeo";
        var number = 5;
        // you can use these for only local variable not for the instance variable
        // instance variable belongs to class, so we can not use var inside the classes

        byte x= 1;
        var y = 1; // var, it understand as a integer
        var price =12.5;

        //List<Integer> numbers = Arrays.asList(3,4,5,6);// so obvious is list, then i can just put it var
        var numbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for (var eachNumber : numbers) {
            sum = sum +eachNumber;
        } //Local variable inference is available inside initialization block of loop statements.

        /*
        Rule: Local variable should be initialized at time of declaration otherwise compiler will not be
        infer and will throw error.
        var str; NOT, compile error
        */

       /*
       var s = "Ayse";
        s= 3;
    Rule: No dynamic type change. Once type of local variable is inferred it cannot be changed.
        */

    }
}
