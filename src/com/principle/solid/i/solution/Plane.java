package com.principle.solid.i.solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Plane implements Drivable, Flyable {

    private static final Logger LOGGER = Logger.getLogger(Plane.class.getName());

    @Override
    public void fly() {
        LOGGER.log(Level.INFO, "{0} can fly", this.getClass().getSimpleName());
    }

    @Override
    public void drive() {
        LOGGER.log(Level.INFO, "{0} can drive", this.getClass().getSimpleName());
    }

}
