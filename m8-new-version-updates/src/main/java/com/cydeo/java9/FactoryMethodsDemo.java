package com.cydeo.java9;

import java.lang.reflect.Array;
import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        //Factory methods means ==> .of() method
        //Creating unmodifiable, immutable List, Set, Map ==> before Java9

        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
        courses.add("TS");
        System.out.println(courses);

        //Creating unmodifiable List after Java9 ==> .of() ==> immutable List, Set, Map
        List<String> myCourses = List.of("Java", "Spring", "Agile");
        myCourses.add("TS");
        System.out.println(courses);

        //Creating unmodifiable Set after Java9
        Set<String> myProducts = Set.of("Milk", "Bread", "Butter");

        //Creating unmodifiable Map after Java9
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV", 1),
                Map.entry("PSP", 1),
                Map.entry("Chair", 5));

        //There are 2 ways to create an immutable map in Java 9.
        //1-Map.of
        Map<Integer,String> studentInfo = Map.of(1,"Ozzy",2,"Mike");
        //2-Map.ofEntries
        Map<Integer,String> studentInfo1 = Map.ofEntries(
        Map.entry(1,"Ozzy"),
        Map.entry(2,"Mike")
        );

    }
}
