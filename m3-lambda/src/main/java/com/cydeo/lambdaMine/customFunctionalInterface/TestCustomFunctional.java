package com.cydeo.lambdaMine.customFunctionalInterface;

public class TestCustomFunctional {

    public static void main(String[] args) {
//============CustomFunctionalInterface Test===================
// we will define this reference variable. I can assign the Lambda expression
// which can contain the implementation of this abstract method
// How we write Lambda expression, it will always be depending on
// the signature of the abstract method of your functional interface
        CustomFunctionalInterface cube = a-> {
            System.out.println(a*a*a);
        };

        cube.test(10);  //1000

        CustomFunctionalInterface oddOrEven = a -> {
            if (a%2 == 0) {
            System.out.println(a + " is even");} else{
                System.out.println(a+ " is odd");
            }
        };

        oddOrEven.test(21);//21 is odd

    }
}
