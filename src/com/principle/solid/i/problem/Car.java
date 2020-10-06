package com.principle.solid.i.problem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Car implements Vehicle {

    private static final Logger LOGGER = Logger.getLogger(Car.class.getName());

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drive() {
        LOGGER.log(Level.INFO, "{0} can drive", this.getClass().getSimpleName());
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException();
    }
}
