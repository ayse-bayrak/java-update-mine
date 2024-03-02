package com.cydeo.task.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll() { // I am directly returning Stream
        return Stream.of(
                new Employee(100, "mike", "mike@cydeo.com", Arrays.asList("2012823737", "3235123125")),
        new Employee(100, "ozzy", "mike@cydeo.com", Arrays.asList("66512823737", "65538925")),
        new Employee(100, "peter", "ozzy@cydeo.com", Arrays.asList("2012435737", "36635123125"))

        );
    }
}
