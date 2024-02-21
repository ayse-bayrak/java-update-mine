package com.cydeo.tasks.CountValue;

import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);

    }

    private static <T> int countIf(List<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c) {
            if (p.test(elem)) {
                ++count;
            }
        }
        return count;
    }

    // why we need to generic

}
/*
Write a generic method to count the number of elements in a collection that
have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:
Sample output:
public interface UnaryPredicate<T> {
public boolean test(T obj);
}
List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate());
System.out.println("Number of odd integers = " + count);
 */