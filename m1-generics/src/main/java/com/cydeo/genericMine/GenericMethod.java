package com.cydeo.genericMine;

import java.util.List;

public class GenericMethod {
/*
    public static void printEach(Integer[] array) {
        for (Integer each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(Double[] array) {
        for (Double each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }
    instead of those different methods we can use generic method,
    generic method declared before return type

   */

    // if we have more than one method with generics the best practice is create Generic Class
    public static <T> void printEach(T[] t) {
        for (T each : t) {
            System.out.println(each);
        }
    }

    public static <T> void printEach (List<T> list) {
        for (T each : list) {
            System.out.println(each);
        }

    }

}
