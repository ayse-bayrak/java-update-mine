package tasksApple;

import java.util.ArrayList;
import java.util.List;

public class PrintApple {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Color.GREEN, 80));
        inventory.add(new Apple(Color.RED, 155));
        inventory.add(new Apple(Color.GREEN, 200));
        inventory.add(new Apple(Color.RED, 180));
        inventory.add(new Apple(Color.GREEN, 230));

        Predicate p = (Apple apple) -> apple.getWeight() < 200 ? "A Light " + apple.getColor() + " apple "  : "A Heavy " + apple.getColor() + " apple";
        prettyPrintApple(inventory, p);
        // I can pass directly
        prettyPrintApple(inventory, apple -> "An apple of " + apple.getWeight() +"g");
        }

    public static void prettyPrintApple(List<Apple> inventory, Predicate p){
        for(Apple apple : inventory){
            String output = p.test(apple);
            System.out.println(output);
        }
    }

}
/*
Write a prettyPrintApple method that takes aList of Apples and that can be
parameterized with multiple ways to generate a String output from an apple
public static void prettyPrintApple(List<Apple> inventory, ???){
for(Apple apple : inventory){
String output = ???.???(apple);
System.out.println(output);
}
}

Sample Output :
A Light GREEN apple
A Heavy RED apple
A Light GREEN apple

Sample Output :
An apple of 80g
An apple of 155g
An apple of 120g
 */