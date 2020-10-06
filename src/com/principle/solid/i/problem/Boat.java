package com.principle.solid.i.problem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Boat implements Vehicle {

    private static final Logger LOGGER = Logger.getLogger(Boat.class.getName());

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void drive() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sail() {
        LOGGER.log(Level.INFO, "{0} can sail", this.getClass().getSimpleName());
    }
}
