package com.cydeo.lambdaMine.build_in_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class TestBiFunction {
    public static void main(String[] args) {
    // BiFunction<T, U, R>
    // it takes tree generic types, first two argument  T, U are argument type last type R is return type
    // R apply(T t, U u);

// suppose that I'm creating a function which can help me to merge two arrays and return it as a list

        BiFunction< int[], int[], List<Integer>> mergeTwoArray = (a, b) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }
           return list;
        };

        int[] arr1 = {5, 7, 9, 11};
        int[] arr2 = {100, 200, 300};

       List<Integer> result = mergeTwoArray.apply(arr1, arr2);
        System.out.println(result);


    }
}
