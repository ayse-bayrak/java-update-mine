package com.cydeo.task.allTaskDay48;
import com.cydeo.task.dish.Dish;
import com.cydeo.task.dish.DishData;
import java.util.*;
import java.util.stream.Collectors;

public class Day48Tasks {
    public static void main(String[] args) {
        System.out.println("==============================8 TASKS ===================================");
        System.out.println("1- Find all transactions in the year 2011 and sort them by value(small to high)");

        TransactionData.getAll().stream()
                .filter(p -> p.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("2- What are all the unique cities where the traders work?");
        Set<String> uniqueCity = TransactionData.getAll().stream()
                .map(p -> p.getTrader().getCity())
                .collect(Collectors.toSet());//since it says unique we use Set, because Set does not duplicate
        System.out.println(uniqueCity);

        System.out.println("3- Find all traders from Cambridge and sort them by name)");
        List<Trader> tradersFromCambridge = TransactionData.getAll().stream()
                .filter(p -> p.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(tradersFromCambridge);

        System.out.println("4. Return a string of all traders’ names sorted alphabetically.");
        String allTradersName = TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted() // to sorted alphabetically
                .reduce("", (x, y) -> x + " " + y); // concat with space
        System.out.println(allTradersName);

        System.out.println("5. Are any traders based in Milan?");
        boolean anyTradersMilan = TransactionData.getAll().stream()
                .anyMatch(p -> p.getTrader().getCity().equalsIgnoreCase("Milan"));
        System.out.println("Are any traders based in Milan " + anyTradersMilan);

        System.out.println("6. Print the values of all transactions from the traders living in Cambridge.");
        TransactionData.getAll().stream()
                .filter(p -> p.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .forEach(System.out::println);

        System.out.println("7. What is the highest value of all the transactions?");
        int highestValue = TransactionData.getAll().stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getValue).findAny().get();
        System.out.println("The highest value of all the transactions " + highestValue);

        System.out.println("8. Find the transaction with the smallest value.");
        int smallestValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .sorted()
                .findAny()
                .get();

        System.out.println("The smallest value of all the transactions " + smallestValue);
    }
}
