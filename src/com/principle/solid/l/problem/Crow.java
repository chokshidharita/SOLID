package com.principle.solid.l.problem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Crow implements Bird {

    private static final Logger LOGGER = Logger.getLogger(Crow.class.getName());

    @Override
    public void fly() {
        LOGGER.log(Level.INFO, "{0} can fly", this.getClass().getSimpleName());
    }

    @Override
    public void eat() {
        LOGGER.log(Level.INFO, "{0} can eat", this.getClass().getSimpleName());
    }
}
