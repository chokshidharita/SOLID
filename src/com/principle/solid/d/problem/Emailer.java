package com.principle.solid.d.problem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Emailer {

    private static final Logger LOGGER = Logger.getLogger(Emailer.class.getName());

    private SpellChecker spellChecker;

    public Emailer(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void checkEmail(String emailBody) {
        LOGGER.log(Level.INFO, "Checking email: {0}", emailBody);
        this.spellChecker.check(emailBody);
    }
}
