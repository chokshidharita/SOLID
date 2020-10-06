package com.principle.solid.i.solution;

public class Main {

    public static void main(String[] args) {
        Drivable car = new Car();
        Sailable boat = new Boat();
        Flyable plane = new Plane();
        Drivable plane1 = new Plane();
        Plane plane2 = new Plane();

        car.drive();
        boat.sail();
        plane.fly();
        plane1.drive();
        plane2.fly();
        plane2.drive();

    }
}
