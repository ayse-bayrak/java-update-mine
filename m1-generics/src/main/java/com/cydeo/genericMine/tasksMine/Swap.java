package com.cydeo.genericMine.tasksMine;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a));

    }

    //    instead of those different methods we can use generic method,
    //    generic method declared before return type
    public static <T> void swap(T[] t, int a, int b){

        for (int i = 0; i < t.length-1; i++) {
             T ternary = t[i];
             t[i]=t[b];
             t[b]=ternary;
        }

    }
}
/*
Write a generic method to exchange the positions of two different elements in
some array.
 */