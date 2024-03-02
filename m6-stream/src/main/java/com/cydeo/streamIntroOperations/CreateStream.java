package com.cydeo.streamIntroOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //How to create Stream - 3 way

        //1-Creating Stream from Array
        String[] courses = {"Java", "Spring", "Agile"};
        Stream<String> courseStream = Arrays.stream(courses);

        //2-Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
        new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102)
                );  // my source

        Stream<Course> myCourseStream = myCourses.stream();  // it is stream which convert from source

        //3-CREATING Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4);



       //your list name. stream ==> convert stream

        //

    }
}
