package com.cydeo.lambdaMine.build_in_FunctionalInterface;

import java.util.function.BiConsumer;

public class TestBiConsumer {
    public static void main(String[] args) {
        //BiConsumer<T, U>
        //void accept(T t, U u);
        // specify string print multiple times, I don't need any return value and we need to two argument, we can use BiConsumer

                    //Parameter types
        BiConsumer <String, Integer> printMultipleTimes = (a, b)-> {
            for (int i = 0; i <b ; i++) {
                System.out.println(a);
            }
        };

        printMultipleTimes.accept("Ayse Gunes Bayrak", 5);
    }
}
