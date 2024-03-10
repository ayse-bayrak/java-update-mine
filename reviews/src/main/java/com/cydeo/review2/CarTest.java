package com.cydeo.review2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {

    public static void main(String[] args) {


        //        Car2 car2 = new Car2();
//        Car2 car22 = new Car2("Toyota");
//        Car2 car23 = new Car2("Toyota", 150);

        Car2 car2FromBuilder = Car2.builder().make("Toyota").topSpeed(150).year(2020).build();
        Car2 car2FromBuilder2 = Car2.builder().build();
        Car2 car2FromBuilder3 = Car2.builder().make("Toyota").build();

        Car carFromBuilder = Car.builder().make("Toyota").build();
        Car carFromBuilder2 = Car.builder().make("Toyota").topSpeed(150).build();

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

        carList.forEach(car -> System.out.println(car));

        System.out.println("Fast Cars -Traditional: ");
        System.out.println(filterFastCars(carList));
        System.out.println("New Cars -Traditional: ");
        System.out.println(filterNewCars(carList));
        System.out.println("Fast Cars -Behaviour Parameterization: ");
        System.out.println(filter(carList, new CarFastPredicate()));
        System.out.println("New Cars -Behaviour Parameterization: ");
        System.out.println(filter(carList, new CarNewPredicate()));
        //In Behaviour Parameterization we have to create "one interface and subclass of that interface" that we need to implementation

        System.out.println("Fast Cars -Lambda: ");
        CarPredicate carPredicate = car-> car.getTopSpeed()>160;
        System.out.println(filter(carList, carPredicate ));
        System.out.println("New Cars -Lambda: ");
        System.out.println(filter(carList, car-> car.getYear()>2015));

        //In Lambda we have to create "one interface" and we don't need to subclasses to implement different action

        System.out.println("Fast Cars -Ready Functional Interface: ");
        Predicate<Car> carPredicate2 = car-> car.getTopSpeed()>160;
        System.out.println(filter2(carList, carPredicate2));
        System.out.println("New Cars -Ready Functional Interface: ");
        System.out.println(filter2(carList, car-> car.getYear()>2015));

        //Java people come up with something like this. They do not need to create any interface

    }
    // I want to filter they based on how fast they are and also i wanna filter based on year
    private static List<Car> filterFastCars (List<Car> carList) {
    List<Car> filteredCars = new ArrayList<>();

        for (Car eachCar: carList) {
            if(eachCar.getTopSpeed()>160) {
                filteredCars.add(eachCar);
            }
        }
return filteredCars;
    } //for Traditional

    private static List<Car> filterNewCars(List<Car> carList) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car eachCar : carList) {
            if (eachCar.getYear() > 2015) {
                filteredCars.add(eachCar);
            }
        }
        return filteredCars;
    }//for Traditional

    private static List<Car> filter(List<Car> carList, CarPredicate carPredicate ) { // i am going to pass another paramether to change how method apps,
        // is it gonna filter the fast car or iis it gonna filter the newCars
        // i need to different kind of object to different behaviour. I use both of polymorphism and abstraction
        // we can change the bevaiour of this filter method based on what we need
        // I was able to do the eaxctly the same filtering by using only one method
        List<Car> filteredCars = new ArrayList<>();

        for (Car eachCar : carList) {
            if (carPredicate.test(eachCar)) {
                filteredCars.add(eachCar);
            }
        }
        return filteredCars;
    }//For Behaviour and Lambda

    private static List<Car> filter2(List<Car> carList, Predicate<Car> carPredicate) {

        List<Car> filteredCars = new ArrayList<>();
        for (Car eachCar : carList) {
            if (carPredicate.test(eachCar)) {
                filteredCars.add(eachCar);
            }
        }
        return filteredCars;

    }// for Lambda-Ready Functional Interface

}
