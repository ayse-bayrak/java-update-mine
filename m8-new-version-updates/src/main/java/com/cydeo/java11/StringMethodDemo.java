package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {
/* with Java 11:
repeat(): It is accepts int count as parameter and returns String whose
value is the concatenation of given String repeated count times.

isBlank(): It is used to check if the String is blank or not. If there is no
character inside the String it is returns true, otherwise it returns false.
• Blank and Null is not the same.

lines(): It is used to get all the lines in a String as a Stream.
 */
        var str = "Mike \nOzzy \nTom \nEmmy";
//      It is used to get all the lines in a String as a Stream.
        //lines() is returning Stream
        str.lines()
                .forEach(System.out::println);
    }
}
