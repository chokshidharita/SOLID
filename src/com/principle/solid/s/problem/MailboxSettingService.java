package com.principle.solid.s.problem;

import com.principle.solid.utils.Role;
import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MailboxSettingService {

    private static final Logger LOGGER = Logger.getLogger(MailboxSettingService.class.getName());

    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        LOGGER.log(Level.INFO, "Changing secondary email: {0}", newSecondaryEmail);
        if (hasAdminAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
            LOGGER.log(Level.INFO, "Secondary email changed successfully");
        }
    }

    public boolean hasAdminAccess(User user) {
        LOGGER.log(Level.INFO, "Checking Admin Access for user: {0}", user);
        return (user.getRole() == Role.ADMIN) ? Boolean.TRUE : Boolean.FALSE;
    }
}
