package com.principle.solid.o.solution;

import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeLoanValidator implements Validator {

    private static final Logger LOGGER = Logger.getLogger(HomeLoanValidator.class.getName());

    @Override
    public boolean isValid(User user) {
        LOGGER.log(Level.INFO, "Validating for user: {0}", user);
        // business logic
        return true;
    }
}
