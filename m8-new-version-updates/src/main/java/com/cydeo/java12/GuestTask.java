package com.cydeo.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {
    public static void main(String[] args) {
        var result =
                Stream.of(        // Guest(String name, boolean participating, Integer participantsNumber)
                                new Guest("Marco", true, 3),
                                new Guest("David", false, 2),
                                new Guest("Roger", true, 6))
      .collect(Collectors.teeing
              // first collector, we select only who confirmed the participation
              (Collectors.filtering(Guest::isParticipating,
                      // whe want to collect only the first name in a list
                      Collectors.mapping(Guest::getName, Collectors.toList())),  // output R1 ==>List<String>
                      // second collector, we want the total number of participants
              Collectors.filtering(Guest::isParticipating,
                      Collectors.summingInt(Guest::getParticipantsNumber)), // output R2 ==> Integer
                      // we merge the collectors in a new Object,
                      // the values are implicitly passed
                      EventParticipation::new)); // merger R1, R2

        System.out.println(result);
    }
}
