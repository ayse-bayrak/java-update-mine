package com.cydeo.task.state;

public class StatesTest {
    public static void main(String[] args) {

        State states = new State();

        states.addCity("Ankara");
        states.addCity("Corum");
        states.addCity("Istanbul");
        states.addCity("Antalya");

        states.getCities().stream()
                .forEach(System.out::println);

    }


}
