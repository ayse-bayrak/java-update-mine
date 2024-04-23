package com.cydeo.task.square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairsOfNumbers {

        public static List<List<Integer>> getAllPairs(List<Integer> list1, List<Integer> list2) {
            return list1.stream()
                    // FlatMap to create pairs from list1 and list2
                    .flatMap(num1 -> list2.stream()
                            .map(num2 -> Arrays.asList(num1, num2))
                    )
                    .collect(Collectors.toList());
        }

        public static void main(String[] args) {
            List<Integer> list1 = Arrays.asList(1, 2, 3);
            List<Integer> list2 = Arrays.asList(3, 4);

            List<List<Integer>> pairs = getAllPairs(list1, list2);

            // Print all pairs
            pairs.forEach(System.out::println);
        }
}
/*
Given two lists of numbers, how would you return all pairs of numbers? For
example, given a list [1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3),
(2,4),(3,3),(3,4)]
 */