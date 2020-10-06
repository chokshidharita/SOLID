package com.principle.solid.o.problem;

import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoanHandler {

    private static final Logger LOGGER = Logger.getLogger(LoanHandler.class.getName());

    private final PersonalLoanValidator personalLoanValidator = new PersonalLoanValidator();
    private final HomeLoanValidator homeLoanValidator = new HomeLoanValidator();

    public void approvePersonalLoan(User user) {
        LOGGER.log(Level.INFO, "Approving Personal loan for user: {0}", user);
        if (personalLoanValidator.isValidUserForPersonalLoan(user)) {
            // proceed
            LOGGER.log(Level.INFO, "Personal loan approved for user: {0}", user);
        }
    }

    public void approveHomeLoan(User user) {
        LOGGER.log(Level.INFO, "Approving Home loan for user: {0}", user);
        if (homeLoanValidator.isValidUserForHomeLoan(user)) {
            // proceed
            LOGGER.log(Level.INFO, "Home loan approved for user: {0}", user);
        }
    }

}

