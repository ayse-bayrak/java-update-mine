package com.cydeo.streamIntroOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {

        //Intermediate operations

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(System.out::println);

        //FILTER ()
        System.out.println("Filter");
        list.stream()
                .filter(i-> i%2==0)  // Intermediate Operation 1, and you need to close the stream
                .forEach(System.out::println); // I am closing stream

        //DISTINCT do not show me the duplicate
        System.out.println("Distinct");

        Stream<Integer> str = list.stream()
                .filter(i -> i%2 == 0) // intermediate operation
                .distinct(); // intermediate operation, stream is open still

        str.forEach(System.out::println);  // terminal operation
        //All the intermadiate operation return the Stream
        //Terminal operation forEach() return void

        //LIMIT(n)
        System.out.println("limit()");

        list.stream()
                .filter(i-> i%2 ==0)
                .limit(1)// still stream is open
                .forEach(System.out::println);

        //SKIP(n)
        System.out.println("skip(n)");

        list.stream()
                .filter(i-> i%2 ==0) // if it is true, keep on the flow (stream flow)
                .skip(1)// still stream is open
                .forEach(System.out::println);


        //map is used to do something `each element`
        System.out.println("map()");
        list.stream()
                .map(number -> number*2)
                .filter(i-> i%3 ==0)
                .forEach(System.out::println); // terminal operator


    }
}
