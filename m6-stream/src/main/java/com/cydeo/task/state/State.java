package com.cydeo.task.state;

import java.util.ArrayList;
import java.util.List;

public class State {

 private List<String> cities = new ArrayList<>();

 public void addCity(String city){
 cities.add(city);
 }

 public List<String> getCities(){
 return this.cities;
 }
}

/*
Suppose we have a State class that contains list of cities. Create a list
of States and print all the cities.
 */