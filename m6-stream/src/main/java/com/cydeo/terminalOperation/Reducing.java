package com.cydeo.terminalOperation;

import com.cydeo.task.dish.Dish;
import com.cydeo.task.dish.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }
        // with reduce()
        int result = numbers.stream().reduce(0, (a,b)->a+b);
        System.out.println(result);

        //without initial value
        Optional<Integer> result2= numbers.stream().reduce( (a, b) -> a+b);
        // if there is no initial value, it is going to return Optional, but output is same
        System.out.println(result2.get());

        System.out.println("Dish calories total");
              int result4 =
                      DishData.getAll().stream()
                       .map(Dish::getCalories)
                      // .reduce((a,b)->a+b).get(); // java don't like to look as this, like :: double colon operator
                              .reduce(Integer::sum).get();

        // reduce is returning Optional,
        // to make it integer we need to get() method

        System.out.println(result4);

        //Max and min

        Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);
        Optional<Integer> min1 = numbers.stream().reduce(Integer::min);
        Optional<Integer> max1 = numbers.stream().reduce(Integer::max);

        System.out.println(numbers.stream().reduce(Integer::sum).get());
        System.out.println(numbers.stream().reduce(Integer::min).get());
        System.out.println(numbers.stream().reduce(Integer::max).get());



        System.out.println("COUNT");// HOW MANY ITEMS you have object in the stream,
        // everything is object in the stream
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);





    }
}
