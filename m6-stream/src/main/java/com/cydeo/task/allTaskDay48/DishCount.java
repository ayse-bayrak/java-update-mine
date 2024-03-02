package com.cydeo.task.allTaskDay48;

import com.cydeo.task.dish.Dish;
import com.cydeo.task.dish.DishData;

public class DishCount {
    public static void main(String[] args) {
        //How would you count the number of dishes in a stream using the map and reduce methods?
        long a = DishData.getAll().size();
        System.out.println(a); //9
        long b = DishData.getAll().stream()
                .map(Dish::getName).count();
        System.out.println(b);
        int c = DishData.getAll().stream()
                .map(Dish::getName)
                .map(dish -> 1) // Map each dish to the value 1
                .reduce(0, Integer::sum); // Sum up the values using reduce
        System.out.println(c);
    }
}
