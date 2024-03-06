package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2,4,6,8);
        List<Integer> unmodifiableList1 =  List.of(2,4,6,8); // listOf() takes values to make unmodifiable
        List<Integer> unmodifiableList = List.copyOf(numberList);// copyOf() takes directly Collection to make unmodifiable
    }
}
