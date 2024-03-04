package com.cydeo.terminalOperation;

import com.cydeo.task.dish.Dish;
import com.cydeo.task.dish.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindingMatching {
    public static void main(String[] args) {

        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);
   // one thing to pay attention here, allMatch() accepting what kind of Lambda expression
        System.out.println(isHealthy);//true

        System.out.println("ANY MATCH");

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");

        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=100);
        System.out.println(isHealthy2);//true

        System.out.println("FIND ANY");

        Optional<Dish> dish =
                DishData.getAll().stream().filter(Dish::isVegetarian).findAny();// prevent null pointer exception
        System.out.println(dish.get());
        //Dish(name=fries, vegetarian=true, calories=530, type=OTHER)

        System.out.println("FIND FIRST");

        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();// prevent null pointer exception
        System.out.println(dish2.get());

        //PARALLEL STREAMS (ASYNC)
        System.out.println(IntStream.range(0,100).parallel().findAny());//OptionalInt[65] - parallel async
        System.out.println(IntStream.range(0,100).parallel().findFirst());//OptionalInt[0]

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

//        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst(); //David
//        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny(); //Jill
        //since we use parallel stream==>async way there is no rule this one

        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();//David
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("J")).findAny();//Jhonny

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //MIN AND MAX
        System.out.println("min");
        Optional<Dish> first = DishData.getAll().stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .findFirst();
        System.out.println(first.get());

        // with min method
        Optional<Dish> dMin =
                DishData.getAll().stream()
                .min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());


        System.out.println("max");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());










    }

}
