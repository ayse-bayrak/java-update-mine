package com.cydeo.task.employee;

import com.cydeo.task.dish.Dish;

import java.util.List;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails
        System.out.println("Print all emails");

        EmployeeData.readAll()
 //             .map(employee -> employee.getEmpEmail()) //both of the things same thing
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print all Phone Numbers");

        EmployeeData.readAll()
                 .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print all Phone Numbers with Double Colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);



    }
}
