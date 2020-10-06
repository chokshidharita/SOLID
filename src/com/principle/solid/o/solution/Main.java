package com.principle.solid.o.solution;

import com.principle.solid.utils.Role;
import com.principle.solid.utils.User;

public class Main {

    public static void main(String[] args) {

        User user = new User(Role.CONTRIBUTOR);

        LoanHandler personalLoanHandler = new PersonalLoanHandler(new PersonalLoanValidator());
        personalLoanHandler.approveLoan(user);

        LoanHandler homeLoanHandler = new HomeLoanHandler(new HomeLoanValidator());
        homeLoanHandler.approveLoan(user);
    }

}
