package com.cydeo.apple;

import com.cydeo.appleOz.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static <T> void main(String[] args) {

        List<Apples> listApple = new ArrayList<>();

        listApple.add(new Apples(Color.GREEN, 250));
        listApple.add(new Apples(Color.GREEN, 350));
        listApple.add(new Apples(Color.RED, 150));
        listApple.add(new Apples(Color.GREEN, 250));
        listApple.add(new Apples(Color.RED, 50));
        listApple.add(new Apples(Color.GREEN, 150));

        ApplePredicate greenApple = new FindGreenApple();
        ApplePredicate heavierApple = new FindHeavierApple();
        System.out.println("Green Apple");
        System.out.println(find(listApple, greenApple));
        System.out.println("Heavier Apple");
        System.out.println(find(listApple, heavierApple));

        System.out.println("=================with lambda==================");
        greenApple = (Apples apple) -> apple.getColor().equals(Color.GREEN);  //without using FindHeavierApple implementing class
        heavierApple = (Apples apple) -> apple.getWeight()>200;

        System.out.println(find(listApple, greenApple));
        System.out.println(find(listApple, heavierApple));
    }

    private static List<Apples> find(List<Apples> listApple, ApplePredicate predicate ) {

        List<Apples> result = new ArrayList<>();

        for (Apples each : listApple) {
            if(predicate.test(each)) {
                result.add(each);
            }
        }
        return result;
    }

}
