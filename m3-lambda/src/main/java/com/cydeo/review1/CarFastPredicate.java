package com.cydeo.review1;

public class CarFastPredicate implements CarPredicate {

    @Override
    public boolean test(Car car) {
        return car.getTopSpeed() > 160;
    }

}
