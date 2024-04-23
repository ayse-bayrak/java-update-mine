package com.cydeo.collectors;


import com.cydeo.task.dish.Dish;
import com.cydeo.task.dish.DishData;
import com.cydeo.task.dish.Type;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

    public static void main(String[] args) {

        //Java Collectors is a utility class...
        //utility class is static class and we can use method in the utility class directly ClassName.methodName
       //Stream.collect()


        //toCollection(Supplier) : is used to create a Collection using Collector want to hold out of stream
        // i need to capture those assign to other where
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        List<Integer> numberList = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList(): returns a Collector interface that gathers the input data into a new List
        //same thing with before one

        List<Integer> numberList2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

        //toSet(): returns a Collector interface gathers the input data into a new Set

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());

        System.out.println(numberSet2);

        //toMap(Function, Function) : accept two parameters , returns a Collector interface that gathers the input data into a new map

        DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a Integer-valued func

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //counting() : returns a Collector that counts the number of the elements

        Long evenCount = numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //averageingInt(ToIntFunction) : returns the average of the integers passed values

        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAverage);

        //joining() : is used to join various elements of a character or string array into a single object

        List<String> courses =Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(str);

        //partitioningBy(): is used to partition a stream of objects (or a set of elements) based on the given predicate

        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        //grupingBy() is used for grouping objects by some properties and storing result in a map instance

        Map<Type, List<Dish>> typeDish = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(typeDish);

    }
}
