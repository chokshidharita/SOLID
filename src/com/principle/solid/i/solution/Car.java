package com.principle.solid.i.solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Car implements Drivable {

    private static final Logger LOGGER = Logger.getLogger(Car.class.getName());

    @Override
    public void drive() {
        LOGGER.log(Level.INFO, "{0} can drive", this.getClass().getSimpleName());
    }
}
