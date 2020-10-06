package com.principle.solid.s.solution;

import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MailboxSettingService {

    private static final Logger LOGGER = Logger.getLogger(MailboxSettingService.class.getName());
    private SecurityService securityService;

    public MailboxSettingService(SecurityService securityService) {
        this.securityService = securityService;
    }

    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        LOGGER.log(Level.INFO, "Changing secondary email: {0}", newSecondaryEmail);
        if (securityService.hasAdminAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
            LOGGER.log(Level.INFO, "Secondary email changed successfully");
        }
    }

}
