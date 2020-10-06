package com.principle.solid.o.solution;

import com.principle.solid.o.problem.PersonalLoanValidator;
import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalLoanHandler implements LoanHandler {

    private static final Logger LOGGER = Logger.getLogger(PersonalLoanValidator.class.getName());
    private Validator validator;

    public PersonalLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveLoan(User user) {
        LOGGER.log(Level.INFO, "Approving Personal loan for user: {0}", user);
        if (validator.isValid(user)) {
            LOGGER.log(Level.INFO, "Personal loan approved for user: {0}", user);
            // process
        }

    }
}
