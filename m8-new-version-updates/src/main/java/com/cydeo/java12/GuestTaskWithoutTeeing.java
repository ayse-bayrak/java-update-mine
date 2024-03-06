package com.cydeo.java12;

import java.util.*;
import java.util.stream.Collectors;

public class GuestTaskWithoutTeeing {
    public static void main(String[] args) {
        List<Guest> guestList = Arrays.asList(
                new Guest("Marco", true, 3),
                new Guest("David", false, 2),
                new Guest("Roger", true, 6));

        //output ==> EventParticipation
        List<String> participantList = guestList.stream()
               .filter(Guest::isParticipating)
               .map(Guest::getName)
                        .collect(Collectors.toList());

        Integer totalParticipant = guestList.stream()
                .filter(Guest::isParticipating)
                .map(Guest::getParticipantsNumber)
                .reduce( Integer::sum)
                .orElseThrow();

       Map<List<String>, Integer> eventResult = new HashMap<>();
       eventResult.put(participantList, totalParticipant);

        System.out.println(eventResult);//{[Marco, Roger]=9}
    }
}
