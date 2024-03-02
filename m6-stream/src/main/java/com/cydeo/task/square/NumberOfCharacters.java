package com.cydeo.task.square;

import java.util.Arrays;
import java.util.List;

public class NumberOfCharacters {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("Java", "Apple", "Honda", "De veloper");

        words.stream()
                .map(p->p.length())
                .forEach(System.out::println);
    }
}
