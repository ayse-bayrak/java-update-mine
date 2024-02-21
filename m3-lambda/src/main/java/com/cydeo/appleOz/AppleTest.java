package com.cydeo.appleOz;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        List<Apple> greenApple = filtersApples(inventory, new AppleGreenColorPredicate());// we create new object to just only use different action different behavior
        System.out.println("Green Apples");
        System.out.println(greenApple);

        List<Apple> heavyApple = filtersApples(inventory, new AppleHeavierPredicate());
        System.out.println("Heavier Apples");
        System.out.println(heavyApple);

        System.out.println("==============With Lambda==================");
        ApplePredicate predicateGreen =   apple  ->  apple.getColor().equals(Color.GREEN);// sytax final looking
        ApplePredicate predicateHeavier = (Apple apple) -> apple.getWeight()>200;

        List<Apple> greenApple1 = filtersApples(inventory, predicateGreen);
        List<Apple> heavyApple2 = filtersApples(inventory, predicateHeavier);
        System.out.println(greenApple);
        System.out.println(heavyApple);

    }
    private static List<Apple> filtersApples(List<Apple> inventory, ApplePredicate applePredicate) {

        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
