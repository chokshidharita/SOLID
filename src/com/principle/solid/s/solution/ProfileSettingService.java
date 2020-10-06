package com.principle.solid.s.solution;


import com.principle.solid.utils.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfileSettingService {

    private static final Logger LOGGER = Logger.getLogger(ProfileSettingService.class.getName());

    private SecurityService securityService;

    public ProfileSettingService(SecurityService securityService) {
        this.securityService = securityService;
    }

    public void changeProfileName(User user, String name) {
        LOGGER.log(Level.INFO, "Changing name: {0}", name);
        if (securityService.hasAdminAccess(user)) {
            user.setName(name);
            LOGGER.log(Level.INFO, "Name changed successfully");
        }
    }
}
