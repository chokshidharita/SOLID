package com.principle.solid.l.solution;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<FlyingBird> flyingBirds = Arrays.asList(new Crow(), new Parrot());
        for (FlyingBird flyingBird : flyingBirds) {
            flyingBird.fly();
        }

        List<Bird> birds = Arrays.asList(new Crow(), new Ostrich(), new Parrot());
        for (Bird bird : birds) {
            bird.eat();
        }

    }
}
