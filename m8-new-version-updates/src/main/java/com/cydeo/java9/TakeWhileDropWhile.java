package com.cydeo.java9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhileDropWhile {

    public static void main(String[] args) {
//takeWhile() vs filter
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
                .filter(i -> i < 4) // all items
                .forEach(System.out::print); //123321
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
                .takeWhile(i -> i < 4) // first occurrence, so steam must be sorted
                .forEach(System.out::print); //123
//=======================================================================
        // limit() vs takeWhile() ==> takeWhile() accept condition limit() does not accept condition, it accepts value
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
                .limit(4)
                .forEach(System.out::print); //1234

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
                .takeWhile(i -> i < 4)
                .forEach(System.out::print); //123
//=======================================================================
        //skip() vs dropWhile() ==> dropWhile() accept condition skip() does not accept condition, it accepts value
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
                .skip(4)
                .forEach(System.out::print); //5678910987654321

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
                .dropWhile(i -> i < 4)
                .forEach(System.out::print); //45678910987654321
//=======================================================================
        //filter() vs takeWhile() vs dropWhile() (drops all the matching one)
        List<Stock> stocks = getStocks();
        System.out.println("Stocks sorted: \n" + stocks);

        //Using Filter
        List<String> stockBelow500Filter = getStocksBelowFiveHundredFilter(stocks);

        System.out.println("Filter output:" + stockBelow500Filter);

        //Using takeWhile
        List<String> stockBelow500 = getStocksBelowFiveHundred(stocks);
        System.out.println("Filter output:" + stockBelow500);

        //Using dropWhile
        List<String> stockAbove500 = getStocksAboveFiveHundred(stocks);
        System.out.println("Filter output:" + stockAbove500);
    }


    public static List<String> getStocksBelowFiveHundredFilter(List<Stock> stocks) {
        return stocks.stream()
                .peek(stock -> System.out.println("Filter processing : " + stock))
                .filter(TakeWhileDropWhile::isStockLessThanFiveHundred)//when we use :: operator? whenever we call a method for implementation of Lambda expression
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStocksBelowFiveHundred(List<Stock> stocks) {
        return stocks.stream()
                .peek(stock -> System.out.println("takeWhile processing : " + stock))
                .takeWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)//In Java 9 They come up with new method-takeWhile method, if the stream is sorted, take While method is gonna work
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStocksAboveFiveHundred(List<Stock> stocks) {
        return stocks.stream()
                .peek(stock -> System.out.println("dropWhile processing : " + stock))
                .dropWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static boolean isStockLessThanFiveHundred(Stock stock) {
        return stock.getValue().compareTo(BigDecimal.valueOf(500)) <= 0; //predicate
    }

    private static List<Stock> getStocks() {

        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("Apple", BigDecimal.valueOf(1000)));
        stocks.add(new Stock("Amazon", BigDecimal.valueOf(800)));
        stocks.add(new Stock("Tesla", BigDecimal.valueOf(400)));
        stocks.add(new Stock("Netflix", BigDecimal.valueOf(2000)));
        stocks.add(new Stock("Facebook", BigDecimal.valueOf(500)));
        stocks.add(new Stock("Instagram", BigDecimal.valueOf(100)));

        return stocks.stream()
                .sorted(Comparator.comparing(Stock::getValue))
                .collect(Collectors.toList());
    }
}
