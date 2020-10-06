package com.principle.solid.i.solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Boat implements Sailable {

    private static final Logger LOGGER = Logger.getLogger(Boat.class.getName());

    @Override
    public void sail() {
        LOGGER.log(Level.INFO, "{0} can sail", this.getClass().getSimpleName());
    }
}
