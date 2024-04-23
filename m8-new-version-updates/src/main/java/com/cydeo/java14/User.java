package com.cydeo.java14;

public record User (String name, String address)  {
    // all field private final
    // this is immutable, this is final, that's why there is no Setter,
    // That is one of the handicap
    // you need Setter, specially UI perspective

    //You have:
    //ALL ARG CONST
    //GETTER
    //TO STRING
    //EQUALS
    //HASH CODE
}
