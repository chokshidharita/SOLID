package com.principle.solid.o.solution;

import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeLoanHandler implements LoanHandler {

    private static final Logger LOGGER = Logger.getLogger(HomeLoanHandler.class.getName());
    private Validator validator;

    public HomeLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        LOGGER.log(Level.INFO, "Approving Home loan for user: {0}", user);
        if (validator.isValid(user)) {
            LOGGER.log(Level.INFO, "Home loan approved for user: {0}", user);
            // process
        }
    }

}
