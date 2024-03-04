package com.cydeo;


public class Calculator {
    public static void findSum(int x, int y) {
        System.out.println("Sum " + (x+y) );
    }

    public void findMultiply(int x, int y) {
        System.out.println("Multiply " + (x*y));
    }

  //  BiConsumer <Integer, Integer> findSum = (x, y)->System.out.println("Sum " + (x+y) );
    // BiConsumer <Integer, Integer> findMultiply= (x, y)->System.out.println("Sum " + (x*y) );

}
