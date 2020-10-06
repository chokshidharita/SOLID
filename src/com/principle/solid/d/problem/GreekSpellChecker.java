package com.principle.solid.d.problem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GreekSpellChecker {

    private static final Logger LOGGER = Logger.getLogger(com.principle.solid.d.solution.GreekSpellChecker.class.getName());

    public void check(String text) {
        LOGGER.log(Level.INFO, "Spell check for text: {0}", text);
        // throws exception in case spelling is wrong in text
    }
}
