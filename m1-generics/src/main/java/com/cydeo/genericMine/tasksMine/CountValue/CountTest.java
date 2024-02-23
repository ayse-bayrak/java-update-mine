package com.cydeo.genericMine.tasksMine.CountValue;

import com.cydeo.tasks.CountValue.OddPredicate;

import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);

        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);

    }
    public static <T> int countIf(List<Integer> t, OddPredicate p) {
        int count = 0;
        for (Integer each : t) {
            if (p.test(each)) {
                count++;
            }
        }
return count;
    }
}
