package com.cydeo.task.allTaskDay48;

import com.cydeo.collectors.CollectorsDemo;
import com.cydeo.task.dish.Dish;
import com.cydeo.task.dish.DishData;

import java.util.stream.Collectors;

public class Tasks {


    public static void main(String[] args) {
 //How would you count the number of dishes in a stream using the map and reduce methods?

        long a = DishData.getAll().stream().count();

        System.out.println(a); //9

       long b = DishData.getAll().stream()
                .map(Dish::getName)
                .collect(Collectors.counting());

        System.out.println(b);

        int c = DishData.getAll().stream()
                .map(Dish::getName)
                .map(dish -> 1) // Map each dish to the value 1
                .reduce(0, Integer::sum); // Sum up the values using reduce

        System.out.println(c);
        //        1. Find all transactions in the year 2011 and sort them by value(small to high)

//        2. What are all the unique cities where the traders work?
//        3. Find all traders from Cambridge and sort them by name.
//        4. Return a string of all traders’ names sorted alphabetically.
//        5. Are any traders based in Milan?
//        6. Print the values of all transactions from the traders living in Cambridge.
//        7. What is the highest value of all the transactions?
//                8. Find the transaction with the smallest value.
    }


}
