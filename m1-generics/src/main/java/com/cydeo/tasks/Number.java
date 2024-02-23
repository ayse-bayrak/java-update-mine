package com.cydeo.tasks;

import java.util.List;

public class Number {

    public static void print(List<? extends Number> list) {
        //that takes a list of elements of type Number or its subclasses.
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}
/*
In the given Java class Number, there's a static method named print that takes a list of elements of type Number or its subclasses.

Method Signature:
---public static void print(List<? extends Number> list)
--public static: This indicates that the method print is accessible from any other class and can be called without creating an instance of Number.
--void: This indicates that the method doesn't return any value.
--print: This is the name of the method.
--(List<? extends Number> list): This part declares the method's parameter. It's a list of elements that extend the Number class or implement a subclass of Number.
The ? extends Number syntax is a wildcard that represents a family of types, all of which are subtypes of Number.
This allows the method to accept lists containing elements of any subclass of Number.
Method Body:
---for (Number n : list)
    System.out.print(n + " ");
---System.out.println();
This loop iterates over each element in the list and prints it using System.out.print. Each element is implicitly cast to type Number because the wildcard ? extends Number ensures that only elements of type Number or its subclasses can be added to the list.
In summary, the print method accepts a list of elements that are instances of Number or its subclasses and prints each element in the list. The use of wildcard ? extends Number allows for flexibility in accepting lists containing elements of different subclasses of Number.
 */