package com.cydeo.lambdaMine.build_in_FunctionalInterface;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        // void accept(T t);
        Consumer<int[]> printEach = arr-> {
            for (int each : arr) {
                System.out.println(each);
            }
        };
        int[] arr = {10,20,30,40, 50};
        printEach.accept(arr);
    }
}
