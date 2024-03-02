package com.cydeo.task.square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareEachNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); //[1,2,3,4,5]
        //Requirement ==> you should return [1,4,9,16,25]
        //we need to print as a List

        List<Integer> square = numbers.stream()
                .map(p->p*p)
                .collect(Collectors.toList());

       System.out.println(square); //[1,4,9,16,25]

    }
}
