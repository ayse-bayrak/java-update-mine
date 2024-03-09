package com.cydeo.java14;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Mike", "VA");  // we have constructor
        System.out.println(user.name()); // diractly call orijinal name do not need to get
        System.out.println(user.toString());
        System.out.println(user.getClass());
        System.out.println(user.getClass().getSimpleName());
        System.out.println(user.hashCode());


    }
}
