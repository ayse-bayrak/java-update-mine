package com.cydeo.review2;

import lombok.Setter;

@Setter
public class Car2 {
    //you can one class inside another class, inner classes, and you can make it static
    private String make;
    private int topSpeed;
    private int year;

    public static Car2Builder builder () { //return type of this method is Car2Builder which is the inner class
        // if the return type is the same with the inner class, it means that I can create one object from this class and return it
            return new Car2Builder();
    }


    public static class Car2Builder {
        private String make;
        private int topSpeed;
        private int year;

        public Car2Builder() { // empty constructor

        }

//        public Car2Builder setMake(String make) {
//            this.make = make;
//            return this;
//        }

        public Car2Builder make(String make) {
            this.make = make;
            return this;
        }

        public Car2Builder topSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
            return this;
        }

        public Car2Builder year(int year) {
            this.year = year;
            return this;
        }

        public Car2 build() { // at the end, we copy the same value from Car2Builder object to Car object
            //and at the end return me Car2 object so that you can have the original target that you need

            Car2 car2 = new Car2();

            if (this.make != null) {
                car2.setMake(this.make);
            }

            if (this.topSpeed != 0) {
                car2.setTopSpeed(this.topSpeed);
            }

            if (this.year != 0) {
                car2.setYear(this.year);
            }

            return car2;

        }

    }

}

// Car2Builder car2Builder = new Car2Builder();
// car2Builder.setMake("BMW"); car2Builder.setTopSpeed(150);
// car2Builder.make("BMW").topSpeed(150).year(2020);
