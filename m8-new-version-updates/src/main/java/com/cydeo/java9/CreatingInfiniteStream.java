package com.cydeo.java9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingInfiniteStream {

    public static void main(String[] args) {
        //Before java 9 ==> based on number
        Stream.iterate(0, n->n+2)
                .limit(10)
                .forEach(System.out::print);//0 2 4 6 8 10 12 14 16 18
        System.out.println();

        //with java 9 ==> based on value
        Stream.iterate(1, n-> n<=1000,n-> n+2 )
                .forEach(System.out::print);//1 3 5 7 9 11 13 15 17.......999
        System.out.println();

        long result = IntStream.iterate(1, n-> n<=1000,n-> n+1)
                .filter(number-> number%7 ==0)
                .count();

        System.out.println("result = " + result);

    }


}
