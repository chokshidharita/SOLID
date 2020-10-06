package com.principle.solid.o.problem;

import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeLoanValidator {

    private static final Logger LOGGER = Logger.getLogger(HomeLoanValidator.class.getName());

    public boolean isValidUserForHomeLoan(User user) {
        LOGGER.log(Level.INFO, "Validating for user: {0}", user);
        // business logic
        return true;
    }
}
