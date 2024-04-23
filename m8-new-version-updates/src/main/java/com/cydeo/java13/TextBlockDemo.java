package com.cydeo.java13;

public class TextBlockDemo {
    public static void main(String[] args) {
// using """ ...... """
        var address = "7925 Jones Branch Drive \n" +
                "McLean, va 22102";
        System.out.println(address);

        var address2 = """
    7925 Jones Branch Drive
    McLean, va 22102
    """;
        System.out.println(address2);
    }
}
