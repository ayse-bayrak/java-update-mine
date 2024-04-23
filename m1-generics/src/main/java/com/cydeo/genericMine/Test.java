package com.cydeo.genericMine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};
        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};
        String[] strings = {"Java", "Phyton", "SQL", "Wooden Spoon"};

        //===============GenericMethod Test=========

        GenericMethod.printEach(numbers); // we can call ClassName.MethodName
        GenericMethod.printEach(decimals);
        GenericMethod.printEach(strings);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(10,20,30));
        GenericMethod.printEach(integerList);

        //==============GenericClass Test=============

        // When you apply the generic types to the class that means this generic type must be
        //specified when you create the object from the class.
        //And all the methods of the object, they will be able to use this Generic Type.
        GenericClass<Integer> obj = new GenericClass<>();
        obj.printEach(numbers);
        obj.printEach(integerList);

        GenericClass<Double> obj2 = new GenericClass<>();
        obj2.printEach(decimals);

        //==============GenericInterface Test=============

        GenericInterface<Integer> displayCube =
                (a) -> {System.out.println(a*a*a);};  // This is lambda expression, like implementing of abstract method of interface
        // i need to lambda expression to complete the abstract method

        GenericInterface<String> thirdCharacter = a-> System.out.println(a.charAt(2));
        thirdCharacter.function("Cydeo");



    }
}
