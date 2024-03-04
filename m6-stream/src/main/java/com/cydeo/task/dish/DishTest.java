package com.cydeo.task.dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishTest {
    public static void main(String[] args) {
        //Print all dish's name that has less than 400 calories
        System.out.println("1-Print all dish's name that has less than 400 calories");
        DishData.getAll().stream()
                .filter(p -> p.getCalories() < 400)
                // .map(p->p.getName()) // can use method references, there is highlighting it says :
                // hey in your lambda expression you are calling a certain method directly by using object name
                //you can directly call Class name
                //ClassName::methodName
                //compiler already knows
                .map(Dish::getName)
                .forEach(System.out::println);

        // Print the length of the name of each dish // each means map
        System.out.println("2-Print the length of the name of each dish");
        DishData.getAll().stream()
                .map(p -> p.getName().length())
                .forEach(System.out::println);

        System.out.println("3-Print the three high caloric dish name");

        DishData.getAll().stream()
                .filter(p -> p.getCalories() > 300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("4-Print all dish name that are below 400 calories in sorted");

        DishData.getAll().stream()  // WHAT I have in the stream? Dish Object (Rice, Other, 400... all properties)
                .filter(p -> p.getCalories() < 400)
                .sorted(comparing(Dish::getCalories).reversed()) // base on the what, we import `import static java.util.Comparator.comparing;`
                .map(Dish::getName) // --------> What do you have in your stream?? only names of dish: RICE, SHRIMP..
                .forEach(System.out::println);

        Stream<Dish> dishStream = DishData.getAll().stream(); // Stream instance
        String str = "Apple";
        //similar  syntax thing
        //Data type - reference name = value;


    }
}
