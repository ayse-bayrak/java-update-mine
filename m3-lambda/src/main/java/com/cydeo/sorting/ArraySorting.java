package com.cydeo.sorting;

public class ArraySorting { // QuickSort, BubleSort
    public static void main(String[] args) {
//less than Java 8, Java can do functional programming like this
        ArraySorting as = new ArraySorting(); // we create an object from ArraySorting
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);
//        qs.sort(); it will be compile also
//        bs.sort(); it will be compile also

        Sorting quickSort = () -> System.out.println("Qick Sort");
        as.sort(quickSort);
        as.sort(() -> System.out.println("Qick Sort"));
        // I can pass directly action as well.

        Sorting bubbleSort = () -> System.out.println("Bubble Sort");
        as.sort(bubbleSort);

    }
    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
