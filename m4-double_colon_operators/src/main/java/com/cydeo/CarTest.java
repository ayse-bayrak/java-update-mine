package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {
        //Zero Argument Constructor
        Supplier<Car> c1 = ()-> new Car();
        Supplier<Car> c2 = Car::new;
        System.out.println(c1.get().getModel());

        // One Argument Constructor
        Function<Integer, Car> f1 = model -> new Car(model);
        Function<Integer, Car> f2 = Car::new;

        //IQ what is the difference between constructor and method?
        //we don't call the constructor's name, we can call with new


        BiFunction<String, Integer, Car> a1 = Car::new;
        //Wright side does not change, only thing you need to find the correct Functional interface

        Car honda = a1.apply("Honda", 2015);
        System.out.println(honda.getMake() + " " + honda.getModel());






    }
}
