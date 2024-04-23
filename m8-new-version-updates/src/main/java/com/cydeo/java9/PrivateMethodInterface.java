package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date); // abstract method from the java 7 and earlier

    default boolean isBusinessDay(LocalDate date){ // default method from the java 8
        validate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){ // default method from the java 8
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }

    private void validate(LocalDate date){ // private method from the java 9
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }
}
