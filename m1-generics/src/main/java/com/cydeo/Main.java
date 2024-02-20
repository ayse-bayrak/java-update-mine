package com.cydeo;

import java.util.ArrayList;

public class Main {
/*
Before Generic
1-What was the problem?
2-What was people doing?

 */
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList();// ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Apple"); // when i add String to items, it give me excepion
        //class java.lang.String cannot be cast to class java.lang.Integer
        //This was the problem
        printDouble(items);
        //String abc = "Java";
        //printDouble(abc);// compile error because required ArrayList in Method parameter

//        LinkedList items1 = new LinkedList();
//        items1.add(new Shape());
    }
// This is what people was doing.
    private static void printDouble(ArrayList<Integer> items) {
        for (Integer i : items) { // it can be int i : items, both are fine
            System.out.println(i*2);
        }
    }
}
