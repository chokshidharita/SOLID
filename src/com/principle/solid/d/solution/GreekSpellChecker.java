package com.principle.solid.d.solution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GreekSpellChecker implements ISpellChecker {

    private static final Logger LOGGER = Logger.getLogger(GreekSpellChecker.class.getName());

    @Override
    public void check(String text) {
        LOGGER.log(Level.INFO, "Spell check for text: {0}", text);
        // throws exception in case spelling is wrong in text
    }
}
