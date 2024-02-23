package com.cydeo.lambdaMine.build_in_FunctionalInterface;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isOdd = a -> {
//(boolean test (T,t)
            if (a%2 != 0) {
                return true;
            } else{
                return false;
            }
        };
        boolean r1 = isOdd.test(100);
        System.out.println(r1);//false

        Predicate<String> isPalindrome = a-> {
            String reversed ="";
            for (int i = a.length()-1; i >=0 ; i--) {
                reversed +=a.charAt(i);
            }
            return a.equalsIgnoreCase(reversed);
        };

        boolean r2 = isPalindrome.test("Wooden Spoon");
        boolean r3 = isPalindrome.test("Laal");
        System.out.println(r2);//false
        System.out.println(r3);//true
    }
}
