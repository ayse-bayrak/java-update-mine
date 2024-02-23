package com.cydeo.lambdaMine.build_in_FunctionalInterface;

import java.util.*;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        //convert to array to List

        //public interface Function<T, R>
        //R apply(T t);
        //R return Type, T parameter Type

        Function<int[],List<Integer>> arrayToList = a->  {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };
       int[] num = {10,20,30,40,50};

       List<Integer> list = arrayToList.apply(num);
        System.out.println(Arrays.toString(num)); //[10, 20, 30, 40, 50]
        System.out.println(list); //[10, 20, 30, 40, 50]


    }
}
