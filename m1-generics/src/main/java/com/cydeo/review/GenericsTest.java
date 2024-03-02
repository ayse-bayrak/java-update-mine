package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

        List<Person> personList = new ArrayList<>();

        personList.add(new Student("Mike", 101));
        personList.add(new Student("Joe", 102));
        personList.add(new Student("Adam", 103));
        personList.add(new Teacher("Albus", 201));
        personList.add(new Teacher("Severus", 202));

        printInfo2(studentList);
        printInfo2(teacherList);
        printInfo2(personList);

//        printInfo3(studentList);
//        printInfo3(teacherList);
        printInfo3(personList);

    }

    // Student extends Person doesn't mean that
    // List<Student> extends List<Person>
    public static void printInfo3(List<Person> personList) {

        for (Person eachPerson: personList) {
            System.out.println(eachPerson);
        }

    }

    // List<Object> -> list have -> 1, "string", Student            -> eliminated (List<T>)
    // List<Object> -> list have -> Student1, Student2, Student3
    // List<Object> -> list have -> 1, 2, 3                         -> eliminated (List<T extends Student>)
    // List<Object> -> list have -> "str1", "str2", "str3"          -> eliminated (List<T extends Student>)
    // List<T>      -> list have -> "str1", "str2", "str3"
    // List<T>      -> list have -> 1, 2, 3
    // List<T>      -> list have -> Student1, Student2, Student3
    // List<T extends Student>      -> list have -> Student1, Student2, Student3
    // List<T extends Person>       -> list have -> Person, Student, Teacher
    public static <T extends Person> void printInfo2(List<T> personList) {

        for (T eachPerson: personList) {
            System.out.println(eachPerson);
        }

    }

    public static void printInfo(List<Student> students) {

        for (Student eachStudent: students) {
            System.out.println(eachStudent);
        }

    }

}
