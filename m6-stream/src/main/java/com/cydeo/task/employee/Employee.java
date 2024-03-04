package com.cydeo.task.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {
    private int empId;   //.stream ==> this became Stream<>
    private String name;
    private String empEmail;
    private List<String> empPhoneNumbers; //with .stream ==> this became Stream< >

}
