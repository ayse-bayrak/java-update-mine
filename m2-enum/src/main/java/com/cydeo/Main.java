package com.cydeo;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");
        Currency c = Currency.DIME; //EnumName.Constant
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to get all constant");
        Currency[] currencies = Currency.values();  ////EnumName.values() -> return array
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
        System.out.println("How to use switch-case with enums");
        switch (Currency.PENNY){// each that constant PENNY, .... it should be that constant,
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

        System.out.println("Operation Task");
       calculate(10, 5, Operation.MINUS);

        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue()); ////EnumName.CONSTANT.getValue()
        System.out.println(Currency.QUARTER.getValue());
        //This structure we're gonna use in the application, we're gonna something from database,
        //We're gonna assign to enum and we're gonna put in the user interface

        System.out.println(Currency.QUARTER.ordinal()); // it is showing index number of Ordinal
    }

    private static void calculate(double x, double y, Operation operation ) {
        switch (Operation.PLUS) {
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }

    }



}
