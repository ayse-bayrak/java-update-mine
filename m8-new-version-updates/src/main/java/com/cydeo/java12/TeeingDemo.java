package com.cydeo.java12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                  //Employee id,    name,    salary

                new Employee(1, "A", 100),
                new Employee(2, "B", 200),
                new Employee(3, "C", 300),
                new Employee(4, "d", 400)
        );

        HashMap<String, Employee> result = employeeList.stream()
                .collect(Collectors.teeing( // getting 3 parameters, two Collectors and merger
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                Collectors.minBy((Comparator.comparing(Employee::getSalary))),
                (e1, e2)-> {
                    HashMap<String, Employee> map = new HashMap<>();
                    map.put("MAX", e1.get());
                    map.put("MIN", e2.get());
                    return map;
                }
        ));
        System.out.println(result);
    }
}

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "com.cydeo.java12.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
