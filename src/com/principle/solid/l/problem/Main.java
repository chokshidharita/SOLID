package com.principle.solid.l.problem;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bird> birds = Arrays.asList(new Crow(), new Ostrich(), new Parrot());
        for (Bird bird : birds) {
            bird.fly();
        }
    }
    /*
     * Here even though Ostrich is a bird, it cannot fly. Thus it ostrich.fly() will throw exception.
     *
     * Liskov Substitution Principle states that if class Ostrich is a subtype of class Bird, then we should be able to
     * replace Bird with Ostrich without disrupting the behavior of our program.
     */

}
