package com.cydeo.genericMine;

import java.util.List;

public class GenericClass <T> {
    // if we have more than one method implementing the generics types, the best practice is create Generic Class
    // it is better if you just apply the generic type to the class
    // when the method is static, it will not allow you to use something that was the instance of this class
    public void printEach(T[] t) {
        for (T each : t) {
            System.out.println(each);
        }
    }

    public void printEach (List<T> list) {
        for (T each : list) {
            System.out.println(each);
        }

    }

}
