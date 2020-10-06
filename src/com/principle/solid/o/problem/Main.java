package com.principle.solid.o.problem;

import com.principle.solid.utils.Role;
import com.principle.solid.utils.User;

public class Main {

    public static void main(String[] args) {

        LoanHandler loanHandler = new LoanHandler();
        User user = new User(Role.CONTRIBUTOR);

        loanHandler.approveHomeLoan(user);
        loanHandler.approvePersonalLoan(user);

        /*
         * Now if we want to introduce a new functionality of Car Loan, we have to modify existing LoanHandler class.
         * Secondly, if we want to customise personal loan based on types of users, we cannot do that as it is tightly
         * bound as a method in LoanHandler class. Now this class cannot be packaged as independent library as it needs
         * to modify LoanHandler everytime we need want to introduce any new loan.
         *
         * Open/Closed principle states that entities should be open for extension, but closed for modification.
         */
    }
}
