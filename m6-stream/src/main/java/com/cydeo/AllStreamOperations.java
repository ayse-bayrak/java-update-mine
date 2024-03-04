package com.cydeo;

import com.cydeo.streamIntroOperations.Course;
import com.cydeo.task.dish.Dish;
import com.cydeo.task.dish.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AllStreamOperations {
    public static void main(String[] args) {
        //How to create Stream - 3 way

        //1-Creating Stream from Array
        String[] courses = {"Java", "Spring", "Agile"};
        Stream<String> courseStream = Arrays.stream(courses);

        //2-Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102)
        );  // my source

        Stream<Course> myCourseStream = myCourses.stream();  // it is stream which convert from source

        //3-CREATING Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4);



        //your list name. stream ==> convert stream

        //

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

        //DISTINCT- Filtereing unique element- do not show me the duplicate
        System.out.println("Distinct");

        Stream<Integer> str = list.stream()
                .filter(i -> i%2 == 0) // intermediate operation
                .distinct(); // intermediate operation, stream is open still

        str.forEach(System.out::println);  //stream close, terminal operation, it is not MUST intermediate operation, you can directly terminal operations
        //All the intermediate operation return the Stream
        //Terminal operation forEach() return void

        //LIMIT(n)-Trancating Stream
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


        // STREAM TERMINAL OPERATION

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

        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();// prevent null pointer exception
        System.out.println(dish.get());
        //Dish(name=fries, vegetarian=true, calories=530, type=OTHER)

        System.out.println("FIND FIRST");

        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();// prevent null pointer exception
        System.out.println(dish2.get());

        //PARALLEL STREAMS (ASYNC)

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

//        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
//        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //min max
        System.out.println("min");
        Optional<Dish> first = DishData.getAll().stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .findFirst();
        System.out.println(first.get());

        // with min method
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());


        System.out.println("max");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());

        //TERMINAL OPERATION REDUCE
        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        // with reduce()
        int result = numbers.stream().reduce(0, (a,b)->a+b);
        System.out.println(result);

        Optional<Integer> result2= numbers.stream().reduce( (a, b) -> a+b);
        // if there is no initial value, it is going to return Optional, but output is same
        System.out.println(result2.get());

        System.out.println("Dish calories total");
        int result4 =
                DishData.getAll().stream()
                        .map(Dish::getCalories)
                        .reduce((a,b)->a+b).get(); // java don't like to look as this

        // reduce is returning Optional,
        // to make it integer we need to get() method

        System.out.println(result4);

        //Max and min
        System.out.println(numbers.stream().reduce(Integer::sum).get());
        System.out.println(numbers.stream().reduce(Integer::min).get());
        System.out.println(numbers.stream().reduce(Integer::max).get());

        System.out.println("COUNT");// HOW MANY ITEMS you have object in the stream,
        // everything is object in the stream
        long dishCount = DishData.getAll().stream().count(); // count() returns long
        System.out.println(dishCount);




    }
}
