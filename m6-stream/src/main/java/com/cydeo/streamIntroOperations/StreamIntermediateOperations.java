package com.cydeo.streamIntroOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        //for the test of intermediate operation, we need to close the stream,
        // so firstly let's learn one of the Terminal Operation ==> forEach()

        List<Integer> list = Arrays.asList(1,2,3,4);
       // list.forEach(System.out::println);// this is coming from the iterable interface

        //Intermediate operations
        // All the intermediate operation return Stream

        //FILTER ()
        System.out.println("Filter");
        list.stream()
                .filter(i-> i%2==0)  // Intermediate Operation 1, and you need to close the stream
                .forEach(System.out::println); // I am closing stream

        //DISTINCT- Filtering unique element- do not show me the duplicate
        System.out.println("Distinct");

        Stream<Integer> str = list.stream()
                .filter(i -> i%2 == 0) // intermediate operation
                .distinct(); // intermediate operation, stream is open still

        str.forEach(System.out::println);  //stream close, terminal operation, it is not MUST intermediate operation, you can directly terminal operations
        //All the intermediate operation return the Stream
        //Terminal operation forEach() return void

        //LIMIT(n)-Truncating Stream
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

        //MAPPING
        //if you want to certain things on each, certain actions with map
        //map is used to do something `each element`and we are changing something, return something rather than Stream
        System.out.println("map()");
        list.stream()
                .map(number -> number*2)
                .filter(i-> i%3 ==0)
                .forEach(System.out::println); // terminal operator

//THIS MAPPING AND FILTER in the development environment we are going to use a lot,
        //because we always did for loop and if statement

    }
}
