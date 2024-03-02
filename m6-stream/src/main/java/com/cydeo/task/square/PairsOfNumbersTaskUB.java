package com.cydeo.task.square;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairsOfNumbersTaskUB {
    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> pairsOfNumbers = numbers1.stream()
                .flatMap(num1 -> numbers2.stream().map(num2 -> new int[]{num1, num2}))
                .collect(Collectors.toList());

        pairsOfNumbers.forEach(eachPair->System.out.println(Arrays.toString(eachPair)));


    }
}