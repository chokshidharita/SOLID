package com.principle.solid.l.solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ostrich implements Bird {

    private static final Logger LOGGER = Logger.getLogger(Ostrich.class.getName());

    @Override
    public void eat() {
        LOGGER.log(Level.INFO, "{0} can eat", this.getClass().getSimpleName());
    }
}
