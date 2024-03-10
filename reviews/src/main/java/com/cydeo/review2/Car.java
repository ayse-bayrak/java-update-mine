package com.cydeo.review2;

import lombok.*;

@AllArgsConstructor(access =AccessLevel.PROTECTED)
@NoArgsConstructor
//@RequiredArgsConstructor
//@ToString(exclude = "topSpeed")
//@Getter
//@Setter()
//@EqualsAndHashCode // it is gonna give you overridden hashcode and equals method
@Data //  is the combineation of @RequiredArgsConstructor @ToString @Getter setter equalsAndHashCode
@Builder
public class Car {

   // @Getter(AccessLevel.NONE)
private String make;
//private final int year;
private int year;
private int topSpeed;



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", topSpeed=" + topSpeed +
                '}';
    }


    //    int f(int x) {
//        return x+5;
//    }
//
//    int g(int x) {
//        return x+10;
//    }
    // two different function

    //f(x) = x+5 // this how we do it in Math  f (g(x)) = g(x)+ 10 +5 = x+15
    //g(x) = x+10                               f(k(x)) = k(x) + 5 = x+1+5 = x+6
    //exactly the same things

    //this is the logic behind ==>
    // i wanna be able to pass one function or one method to another function or to another method in Java
    //method can not be a parameter of another method if you don't use Lambda, the result of a method can be another methods parameter
// being able to pass one function into another function gives some flexibility
    //we want to be able to change the behaviour of one function  or one method by passing another function inside of it.
    //in java we can not do it, what we need to do? first get the value from this one, first call it, save the value, then take this value and pass it again.
    // But i can not directly create something like this, i can not use this function as a parameter
    // How we can create something like this in Java? by using lambda, but lambda came up with Java 8,
    // before Java 8 we had to be able to achieve the something similar, basically to be able to change the behavior of one method by passing some different stuff it.

}
