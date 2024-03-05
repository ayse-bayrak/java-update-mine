package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2); //0.30000000000001137
                                             // this precision does not work

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");// we should pass String inside in this way
        // one more way create Big Decimal object
        BigDecimal b3 = BigDecimal.valueOf(374.56);
      //  System.out.println(b1-b2); //Operator '-' cannot be applied to Object
        System.out.println(b1.subtract(b2));

        BigDecimal b4 = BigDecimal.TEN;
        System.out.println(b4);

        //Scaling
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));
        System.out.println(number1.setScale(2, RoundingMode.FLOOR));
        System.out.println(number1.setScale(2, RoundingMode.CEILING));

        //since these are Object, Do not use equals(). Use compareTo()
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));


    }
}

class Employee{
    private String name;
    private BigDecimal salary;
//    private double salary;
}