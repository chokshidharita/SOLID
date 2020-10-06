package com.principle.solid.i.problem;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plane = new Plane();

        car.drive();
        boat.sail();
        plane.fly();

        /*
         * Here even though car boat and plane are vehicles,they have different behaviour. Thus we should create
         * behavioural interface instead of parent type.
         *
         * Interface Segregation Principle states that No client should be forced to implement methods that it doesn't
         * use. Large classes implement multiple smaller interfaces that group functions according to their usage
         */

    }
}
