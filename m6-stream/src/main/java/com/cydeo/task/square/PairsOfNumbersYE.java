package com.cydeo.task.square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsOfNumbersYE {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs = new ArrayList<>();

        numbers1.forEach(x -> numbers2.stream() // we can forEach() without .stream()
                        .map(y -> new int[]{x, y})
                        .forEach(pairs::add) // we can use method reference
                );
        pairs.forEach(p -> System.out.println(Arrays.toString(p)));
    }
}
