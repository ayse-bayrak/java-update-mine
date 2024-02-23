package com.cydeo.lambdaMine.build_in_FunctionalInterface;

import java.util.function.BiPredicate;

public class TestBiPredicate {
    public static void main(String[] args) {
        //BiPredicate<T, U>
        //boolean test(T t, U u);
        //I want to verify if argument include in the other argument we need to bipredicate
        //since int[] is object, it is accepted
        BiPredicate<int[], Integer > contains =  (a, b)-> {
            for (int each : a) {
                if (each==b) {
                    return true;
                }
            }
            return false;
        };

        int[] nums = {100,200,300,400,500};

       boolean r1= contains.test(nums, 600);
       System.out.println(r1); // false

    }
}
