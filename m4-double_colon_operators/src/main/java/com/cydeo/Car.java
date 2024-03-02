package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Car {
    private String make;
    private int model;

    public Car(int model) {
        this.model = model;
    }

}
