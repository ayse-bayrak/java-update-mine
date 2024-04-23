package com.cydeo;

public enum ProjectStatus {

    OPEN, CLOSED, PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus(String status) {
        this.status = status;
    } // enum constructor always private because we don't want to be changeable outside the class

    ProjectStatus() {
    } //we define two contructor, one of them is no argument constructor so that we can define without value
}
