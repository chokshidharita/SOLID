package com.principle.solid.s.solution;

import com.principle.solid.utils.Role;
import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SecurityService {

    private static final Logger LOGGER = Logger.getLogger(SecurityService.class.getName());

    public boolean hasAdminAccess(User user) {
        LOGGER.log(Level.INFO, "Checking Admin Access for user: {0}", user);
        return (user.getRole() == Role.ADMIN) ? Boolean.TRUE : Boolean.FALSE;
    }

}
