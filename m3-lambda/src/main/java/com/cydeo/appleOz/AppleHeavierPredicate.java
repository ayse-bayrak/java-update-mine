package com.cydeo.appleOz;

public class AppleHeavierPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
