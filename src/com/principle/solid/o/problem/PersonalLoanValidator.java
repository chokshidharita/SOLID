package com.principle.solid.o.problem;

import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalLoanValidator {

    private static final Logger LOGGER = Logger.getLogger(PersonalLoanValidator.class.getName());

    public boolean isValidUserForPersonalLoan(User user) {
        LOGGER.log(Level.INFO, "Validating for user: {0}", user);
        // business logic
        return true;
    }
}
