package com.principle.solid.l.solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Parrot implements FlyingBird {

    private static final Logger LOGGER = Logger.getLogger(Parrot.class.getName());

    @Override
    public void fly() {
        LOGGER.log(Level.INFO, "{0} can fly", this.getClass().getSimpleName());
    }

    @Override
    public void eat() {
        LOGGER.log(Level.INFO, "{0} can eat", this.getClass().getSimpleName());
    }
}
