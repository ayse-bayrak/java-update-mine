package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    //it comes with Java 8 and basically Optional is a new Type
    public static void main(String[] args) {


        List<Integer> number = Arrays.asList(2, 4, 2, 10, 23);
        //empty()- isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty);//Optional.empty
        System.out.println(empty.isPresent());//False

        System.out.println(Optional.of(number).isPresent());//True

        //ifPresent
        Optional<Integer> bigNumber = number.stream()
                .filter(x-> x>100).findAny();
        bigNumber.ifPresent(System.out::println); //nothing

        // get
    //    System.out.println(bigNumber.get()); // No value present


        //we should use orElse() instead of get() and is Present() combining
        //orElse
        System.out.println(bigNumber.orElse(5));//5

    }
}
