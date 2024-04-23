package com.cydeo.java14;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Mike", "VA");  // we have constructor
        System.out.println(user.name()); //Mike // diractly call orijinal name do not need to get
        System.out.println(user.toString()); //User[name=Mike, address=VA]
        System.out.println(user.getClass()); //class com.cydeo.java14.User
        System.out.println(user.getClass().getSimpleName()); //User
        System.out.println(user.hashCode()); //74347861
    }
}
